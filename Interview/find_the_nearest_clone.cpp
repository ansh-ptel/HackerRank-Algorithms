#include <bits/stdc++.h>

using namespace std;

vector<string> split_string(string);

// Complete the findShortest function below.

/*
 * For the unweighted graph, <name>:
 *
 * 1. The number of nodes is <name>_nodes.
 * 2. The number of edges is <name>_edges.
 * 3. An edge exists between <name>_from[i] to <name>_to[i].
 *
 */
int findShortest(int graph_nodes, vector<vector<int> >& adj, vector<long>& ids, int val) {
    // solve here
    vector<int> targets;
    for(int i=0;i<ids.size();i++){
        if(ids[i]==val){
            targets.push_back(i);
        }
    }
    int ans=-1;
    for(int t: targets){
        priority_queue<pair<int,int>, vector<pair<int,int>>, greater<pair<int,int>> > q;
        q.push(make_pair(0,t));
        vector<int> dist(ids.size(), INT32_MAX);
        dist[t]=0;
        while(!q.empty()){
            int u=q.top().second;
            q.pop();
            for(auto j=adj[u].begin();j!=adj[u].end();j++){
                if(dist[*j]>dist[u]+1){
                    dist[*j]=dist[u]+1;
                    q.push(make_pair(dist[*j], *j));
                }
            }
        }
        for(int i: targets){
            if(i==t) continue;
            if(dist[i]<INT32_MAX && (ans==-1 || ans>dist[i])){
                ans=dist[i];
            }
            if(ans==1) break;
        }
        if(ans==1) break;
    }
    return ans;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int graph_nodes;
    int graph_edges;

    cin >> graph_nodes >> graph_edges;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    vector<vector<int> > adj(graph_nodes);

    for (int i = 0; i < graph_edges; i++) {
        int u,v;
        cin>>u>>v;
        adj[u-1].push_back(v-1);
        adj[v-1].push_back(u-1);
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
    }

    string ids_temp_temp;
    getline(cin, ids_temp_temp);

    vector<string> ids_temp = split_string(ids_temp_temp);

    vector<long> ids(graph_nodes);

    for (int i = 0; i < graph_nodes; i++) {
        long ids_item = stol(ids_temp[i]);

        ids[i] = ids_item;
    }

    int val;
    cin >> val;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    int ans = findShortest(graph_nodes, adj, ids, val);

    fout << ans << "\n";

    fout.close();

    return 0;
}

vector<string> split_string(string input_string) {
    string::iterator new_end = unique(input_string.begin(), input_string.end(), [] (const char &x, const char &y) {
        return x == y and x == ' ';
    });

    input_string.erase(new_end, input_string.end());

    while (input_string[input_string.length() - 1] == ' ') {
        input_string.pop_back();
    }

    vector<string> splits;
    char delimiter = ' ';

    size_t i = 0;
    size_t pos = input_string.find(delimiter);

    while (pos != string::npos) {
        splits.push_back(input_string.substr(i, pos - i));

        i = pos + 1;
        pos = input_string.find(delimiter, i);
    }

    splits.push_back(input_string.substr(i, min(pos, input_string.length()) - i + 1));

    return splits;
}
