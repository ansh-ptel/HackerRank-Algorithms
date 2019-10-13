#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <queue>
using namespace std;

class Graph {
    vector<vector<int>> adj;
    public:
        Graph(int n) {
            adj.resize(n);
        }
    
        void add_edge(int u, int v) {
            adj[u].push_back(v);
            adj[v].push_back(u);
        }
    
        vector<int> shortest_reach(int start) {
            vector<int> dist(adj.size(), -1);
            dist[start]=0;
            queue<int> Q;
            Q.push(start);
            while(!Q.empty()){
                int n=Q.front();
                Q.pop();
                for(auto it=adj[n].begin();it!=adj[n].end();it++){
                    if(dist[*it]==-1 || dist[*it]>dist[n]+6){
                        dist[*it] = dist[n]+6;
                        Q.push(*it);
                    }
                }
            }
            return dist;
        }
    
};

int main() {
    int queries;
    cin >> queries;
        
    for (int t = 0; t < queries; t++) {
      
		int n, m;
        cin >> n;
        // Create a graph of size n where each edge weight is 6: 
        Graph graph(n);
        cin >> m;
        // read and set edges
        for (int i = 0; i < m; i++) {
            int u, v;
            cin >> u >> v;
            u--, v--;
            // add each edge to the graph
            graph.add_edge(u, v);
        }
		int startId;
        cin >> startId;
        startId--;
        // Find shortest reach from node s
        vector<int> distances = graph.shortest_reach(startId);

        for (int i = 0; i < distances.size(); i++) {
            if (i != startId) {
                cout << distances[i] << " ";
            }
        }
        cout << endl;
    }
    
    return 0;
}

