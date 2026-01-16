#include <iostream>
using namespace std;

template <class T>
void Reverse(T *arr, int iSize)
{
    int Sum = 0;

    cout<<"Reverse array:"<<"\n";

    for (int i = iSize -1; i >=0; i--)
    {
        cout<<arr[i]<<" ";
    }
     
}

int main()
{
    int arr[] = {11, 20, 13, 40, 50};

    Reverse(arr, 5);

    return 0;
}
