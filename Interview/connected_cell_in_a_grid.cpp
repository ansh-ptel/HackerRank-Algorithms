#include <bits/stdc++.h>

using namespace std;

// Complete the maxRegion function below.
int maxRegion(vector<vector<int>>& grid, const int n, const int m) {
    vector<vector<bool> > visited(n, vector<bool>(m, false));
    int ans=0;
    for(int i=0;i<grid.size();i++){
        for(int j=0;j<grid[i].size();j++){
            if(!grid[i][j] || visited[i][j]) continue;
            int count=1;
            visited[i][j]=true;
            stack<pair<int,int>> s;
            s.push(make_pair(i,j));
            while(!s.empty()){
                int u=s.top().first, v=s.top().second;
                s.pop();
                if(u+1<n && grid[u+1][v] && !visited[u+1][v]){
                    s.push(make_pair(u+1,v));
                    count++;
                    visited[u+1][v]=true;
                }
                if(v+1<m && grid[u][v+1] && !visited[u][v+1]){
                    s.push(make_pair(u,v+1));
                    count++;
                    visited[u][v+1]=true;
                }
                if(u+1<n && v+1<m && grid[u+1][v+1] && !visited[u+1][v+1]){
                    s.push(make_pair(u+1,v+1));
                    count++;
                    visited[u+1][v+1]=true;
                }
                if(u>0 && grid[u-1][v] && !visited[u-1][v]){
                    s.push(make_pair(u-1,v));
                    count++;
                    visited[u-1][v]=true;
                }
                if(v>0 && grid[u][v-1] && !visited[u][v-1]){
                    s.push(make_pair(u,v-1));
                    count++;
                    visited[u][v-1]=true;
                }
                if(u>0 && v>0 && grid[u-1][v-1] && !visited[u-1][v-1]){
                    s.push(make_pair(u-1,v-1));
                    count++;
                    visited[u-1][v-1]=true;
                }
                if(u+1<n && v>0 && grid[u+1][v-1] && !visited[u+1][v-1]){
                    s.push(make_pair(u+1,v-1));
                    count++;
                    visited[u+1][v-1]=true;
                }
                if(u>0 && v+1<m && grid[u-1][v+1] && !visited[u-1][v+1]){
                    s.push(make_pair(u-1,v+1));
                    count++;
                    visited[u-1][v+1]=true;
                }
            }
            ans=max(ans,count);
        }
    }
    return ans;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    int m;
    cin >> m;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    vector<vector<int>> grid(n);
    for (int i = 0; i < n; i++) {
        grid[i].resize(m);

        for (int j = 0; j < m; j++) {
            cin >> grid[i][j];
        }

        cin.ignore(numeric_limits<streamsize>::max(), '\n');
    }

    int res = maxRegion(grid, n, m);

    fout << res << "\n";

    fout.close();

    return 0;
}
