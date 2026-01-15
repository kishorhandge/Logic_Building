#include <iostream>
using namespace std;

template <class T>
T Max(T *arr, int iSize)
{
    T iMax = 0;
    iMax = arr[0];

    if (iSize <= 0)
    {
        return -1;
    }

    for (int i = 0; i < iSize; i++)
    {   
        if(arr[i]>iMax)
        {
            iMax = arr[i];
        }
        
    }

    return iMax;
}

int main()
{
    int arr[] = {10, 20, 30, 40, 50};
    float brr[] = {10.0, 3.7, 9.8, 8.7};

    int iRet= Max(arr, 5);
    printf("%d\n",iRet);    //50

    float fRet = Max(brr, 4);
    printf("%f\n",fRet);    //10

    return 0;
}
