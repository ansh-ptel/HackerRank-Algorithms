#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main(){
    int n,sum1=0,sum2=0;
    cin >> n;
    vector< vector<int> > a(n,vector<int>(n));
    for(int a_i = 0;a_i < n;a_i++){
       for(int a_j = 0;a_j < n;a_j++){
          cin >> a[a_i][a_j];
       }
    }
    for(int a_i=0;a_i<n; a_i++){
        sum1+=a[a_i][a_i];
        sum2+=a[a_i][n-a_i-1];
   
    }
    cout<<(sum1>sum2?(sum1-sum2):(sum2-sum1));
    return 0;
}
