#include <iostream>
using namespace std;

template <class T>
bool CheckSorted(T *arr,int iSize)
{
    for (int i = 0; i < iSize; i++)
    {   
        if(arr[i]<arr[i+1])
        {
            return true;
        }
       
    }

    return false;
     
}

int main()
{
    int arr[] = {10, 20, 30, 40, 50};
    bool bRet = false;

    bRet = CheckSorted(arr,5); 

    if(bRet == true)
    {
        cout<<"Array is sorted\n";
    }
    else
    {
        cout<<"Array is not sorted\n";
    }

    return 0;
}
