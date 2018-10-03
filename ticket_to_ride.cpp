#include <bits/stdc++.h>

using namespace std;

/*
 * Complete the runningMedian function below.
 */
vector<double> runningMedian(vector<int> a) {
    priority_queue<int, vector<int>, greater<int>> minHeap;
    priority_queue<int> maxHeap;
    vector<double> result;
    double median=(double)a[0];
    result.push_back(median);
    if(a.size()==1)
        return result;
    median=(double)(a[0]+a[1])/2;
    result.push_back(median);
    if(a[0]<=a[1]){
        maxHeap.push(a[0]);
        minHeap.push(a[1]);
    }else{
        maxHeap.push(a[1]);
        minHeap.push(a[0]);
    }
    for(int i=2;i<a.size();i++){
        if(a[i]<=median)
            maxHeap.push(a[i]);
        else
            minHeap.push(a[i]);
        while(minHeap.size()>1+maxHeap.size()){
            maxHeap.push(minHeap.top());
            minHeap.pop();
        }
        while(maxHeap.size()>1+minHeap.size()){
            minHeap.push(maxHeap.top());
            maxHeap.pop();
        }
        if(minHeap.size()==maxHeap.size())
            median = (double)(minHeap.top()+maxHeap.top())/2;
        else if(minHeap.size()>maxHeap.size())
            median = (double)minHeap.top();
        else
            median = (double)maxHeap.top();
        result.push_back(median);
    }
    return result;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int a_count;
    cin >> a_count;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    vector<int> a(a_count);

    for (int a_itr = 0; a_itr < a_count; a_itr++) {
        int a_item;
        cin >> a_item;
        cin.ignore(numeric_limits<streamsize>::max(), '\n');

        a[a_itr] = a_item;
    }

    vector<double> result = runningMedian(a);

    for (int result_itr = 0; result_itr < result.size(); result_itr++) {
        fout << result[result_itr];

        if (result_itr != result.size() - 1) {
            fout << "\n";
        }
    }

    fout << "\n";

    fout.close();

    return 0;
}
