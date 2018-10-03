#include <iostream>
using namespace std;
int main()
{
    cout << "enter starting number" << endl;
    int left;
    cin >> left;
    cout << "enter last number" << endl;
    int right;
    cin >> right;
    for (int i = left + 1; i < right; i++)
    {
        cout << i << endl;
    }
}