#include <iostream>
using namespace std;

template <class T>
T SumOdd(T *arr, int iSize)
{
    int Sum = 0;

    for (int i = 0; i < iSize; i++)
    {
        if (arr[i] % 2 == 1)
        {
            Sum = Sum + arr[i];
        }
    }
    return Sum;
}

int main()
{
    int arr[] = {11, 20, 13, 40, 50};
    int iRet = 0;

    iRet = SumOdd(arr, 5);

    cout<<"Summation Of Odd Number Is:"<<iRet<<"\n";

    return 0;
}
