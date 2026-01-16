#include <iostream>
using namespace std;

template <class T>
T SumEven(T *arr, int iSize)
{
    int Sum = 0;

    for (int i = 0; i < iSize; i++)
    {
        if (arr[i] % 2 == 0)
        {
            Sum = Sum + arr[i];
        }
    }
    return Sum;
}

int main()
{
    int arr[] = {10, 20, 30, 40, 50};
    int iRet = 0;

    iRet = SumEven(arr, 5);

    cout<<"Summation Of Even Number Is:"<<iRet<<"\n";

    return 0;
}
