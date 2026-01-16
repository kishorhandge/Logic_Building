#include <iostream>
using namespace std;

template <class T>
bool Search(T *arr, int iSize, T value)
{
    int Count = 0;

    for (int i = 0; i < iSize; i++)
    {
        if (arr[i] == value)
        {
            Count++;
        }
    }
    if (Count > 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    int arr[] = {10, 20, 30, 40, 50};
    bool bRet = false;

    bRet = Search(arr, 5, 30);

    if (bRet == true)
    {
        cout << "Element is present in data:\n";
    }
    else
    {
        cout << "Element is not present in data:\n";
    }

    return 0;
}
