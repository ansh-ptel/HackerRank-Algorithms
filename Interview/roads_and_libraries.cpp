#include <bits/stdc++.h>
#include <vector>
#include <map>
#include <algorithm>
#include <cstring>
using namespace std;

void create(int k, vector<int> &parent){
    parent[k]=k;
}

int findParent(int x,vector<int> &parent){
    if(x!=parent[x]){
        parent[x]=findParent(parent[x],parent);
    }
    return parent[x];
}

void merge(int x,int y,vector<int> &parent,int &count){
    int p1=findParent(x,parent);
    int p2=findParent(y,parent);
    if(p1!=p2){
        count--;
        parent[p1]=parent[p2];
    }
}

void disjoint(vector<int> &parent,vector<vector<int>> &link,int &count){
    for(int i=0;i<link.size();i++){
        for(int j=0;j<link[i].size();j++)
            merge(i,link[i][j],parent,count);
    }
}
int main() {
    int q;
    cin >> q;
    for(int a0 = 0; a0 < q; a0++){
        int cities;
        int roads;
        long libcost;
        long roadcost;
        cin >> cities >> roads >> libcost >> roadcost;
        if(libcost<=roadcost || roads==0){
            cout<<(long long int)libcost*cities<<endl;
            int city_1,city_2;
            for(int i=0;i<roads;i++)
                cin>>city_1>>city_2;
            continue;
        }
        vector<vector<int>> link(cities);
        for(int a1 = 0; a1 < roads; a1++){
            int city_1;
            int city_2;
            cin >> city_1 >> city_2;
            link[city_1-1].push_back(city_2-1);
            link[city_2-1].push_back(city_1-1);
        }
        vector<int> parent(cities);
        for(int i=0;i<cities;i++)
            create(i,parent);
        int count=cities;
        disjoint(parent,link,count);
        vector<int> lengths(cities);
        for_each(parent.begin(),parent.end(),[&](int val){
            lengths[findParent(val,parent)]++;
        });
        long int cost=0;
        for_each(lengths.begin(),lengths.end(),[&](int l){
            if(l==0)
                return;
            cost+=(l-1)*roadcost+libcost;
        });
        cout<<cost<<endl;
    }
    return 0;
}

