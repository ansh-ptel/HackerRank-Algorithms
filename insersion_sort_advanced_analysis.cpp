#include <bits/stdc++.h>
#include <algorithm>

using namespace std;

vector<string> split_string(string);

long long merge(vector<int> &a, int low, int mid, int high){
    vector<int> result;
    long long count=0;
    int i=low, j=mid;
    while(i<mid && j<high){
        if(a[i]<=a[j])
            result.push_back(a[i++]);
        else{
            result.push_back(a[j++]);
            count += (long long)mid-i;
        }
    }while(i<mid)
        result.push_back(a[i++]);
    while(j<high)
        result.push_back(a[j++]);
    for(size_t k=0;k<result.size();k++)
        a[low+k]=result[k];
    return count;
}

// Complete the insertionSort function below.
void insertionSort(vector<int> &arr, long long &count, int low, int high) {
    if(low+1>=high)
        return;
    int mid = (low+high)/2;
    insertionSort(arr, count, low, mid);
    insertionSort(arr, count, mid, high);
    count+=merge(arr, low, mid, high);
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int t;
    cin >> t;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    for (int t_itr = 0; t_itr < t; t_itr++) {
        int n;
        cin >> n;
        cin.ignore(numeric_limits<streamsize>::max(), '\n');

        string arr_temp_temp;
        getline(cin, arr_temp_temp);

        vector<string> arr_temp = split_string(arr_temp_temp);

        vector<int> arr(n);

        for (int i = 0; i < n; i++) {
            int arr_item = stoi(arr_temp[i]);

            arr[i] = arr_item;
        }
 
        long long result = 0;
        insertionSort(arr, result, 0, n);

        fout << result << "\n";
    }

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
