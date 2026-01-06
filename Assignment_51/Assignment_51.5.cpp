#include <iostream>
using namespace std;

template <class T>

void Reverse(T *arr, int iSize)
{
    int iStart = 0;
   int iEnd = iSize - 1;
    T temp;

    while(iStart< iEnd)
    {
        temp = arr[iStart];
        arr[iStart] = arr[iEnd];
        arr[iEnd] = temp;

        iStart++;
        iEnd--;
         
    }
    
}

int main()
{
    int arr[] = {10, 20, 30, 10, 30,40, 10, 40, 10};

    cout << "Original Array: ";

    for (int iCnt = 0; iCnt < 9; iCnt++)
    {
        cout << arr[iCnt] << " ";
    }

    Reverse(arr, 9);
    cout<<"\n";

    cout << "Reverse Array: ";

    for (int iCnt = 0; iCnt < 9; iCnt++)
    {
        cout << arr[iCnt]<<" ";
    }

    return 0;
}
