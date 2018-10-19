#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n;
    cin >> n;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            (j>=(n-i-1))?cout<<"#":cout<<" ";
        }
        cout<<'\n';
    }
    return 0;
}
