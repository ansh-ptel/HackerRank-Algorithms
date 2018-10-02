#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main(){
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int arr_i = 0;arr_i < n;arr_i++){
       cin >> arr[arr_i];
    }
    float stats[3];
    for(int i=0;i<n;i++){
        if(arr[i]>0)
            stats[0]++;
        else if(arr[i]<0)
            stats[1]++;
        else
            stats[2]++;
    }
    for(int i=0;i<3;i++)
        cout<<(float)stats[i]/n<<endl;
    return 0;
}
