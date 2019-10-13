#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int const INF = 1e9;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int n, ml;
    cin>>n>>ml;
    vector<vector<int>> arr(n);
    vector<int> count(n,0), dir;
    vector<bool> visited(n, false);
    int x, y;
    for(int i=0;i<ml;i++){
        cin>>x>>y;
        arr[x-1].push_back(y-1);
        arr[y-1].push_back(x-1);
        count[x-1]++;
        count[y-1]++;
    }
    int mn = min_element(count.begin(), count.end())-count.begin();
    while(mn!=-1){
        dir.push_back(mn+1);
        visited[mn]=true;
        int m = -1;
        for(auto it=arr[mn].begin();it!=arr[mn].end();it++){
            if(visited[*it]) continue;
            count[*it]--;
            if(m==-1 || count[*it]<count[m]){
                m = *it;
            }
        }
        mn = m;
    }
    cout<<dir.size()<<endl;
    for(int i: dir){
        cout<<i<<" ";
    }
    return 0;
}
