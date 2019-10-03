#include <bits/stdc++.h>

using namespace std;

int main() {
    vector<int> arr(5);
    for(int arr_i = 0; arr_i < 5; arr_i++){
       cin >> arr[arr_i];
    }
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            if(arr[i]<arr[j]){
                arr[i]+=arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]-=arr[j];
            }
        }
    }
    unsigned long small=0,large=0;
    for(int i=0;i<4;++i){
        small+=arr[i];
        large+=arr[i+1];
    }
    cout<<small<<" "<<large;
    return 0;
}
