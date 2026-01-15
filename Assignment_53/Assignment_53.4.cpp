#include <iostream>
using namespace std;

template <class T>
T SecondSmall(T *arr,int iSize)
{   
    T small;
    T Ssmall;

    if (arr[0] < arr[1])
    {
        small = arr[0];
        Ssmall = arr[1];
    }
    else
    {
        small = arr[1];
        Ssmall = arr[0];
    }

    for (int i = 2; i < iSize; i++)
    {   
        if(arr[i] < small )
        {   
            Ssmall = small;
            small= arr[i];
        }
        else if(arr[i] < Ssmall && arr[i] != small)
        {
            Ssmall = arr[i];
        }
       
    }

    return Ssmall;
     
}

int main()
{
    int arr[] = {10, 20, 30, 40, 50};

    int iRet = SecondSmall(arr,5); 
    printf("%d\n",iRet);
     
    return 0;
}
