#include <iostream>
using namespace std;

template <class T>
T SecondMax(T *arr,int iSize)
{   
    T lar = arr[0];
    T Slar = arr[0];

    for (int i = 1; i < iSize; i++)
    {   
        if(arr[i] > lar )
        {   
            Slar = lar;
            lar = arr[i];
        }
        else if(arr[i]> Slar && arr[i] != lar)
        {
            Slar = arr[i];
        }
       
    }

    return Slar;
     
}

int main()
{
    int arr[] = {10, 20, 30, 40, 50};

    int iRet = SecondMax(arr,5); 
    printf("%d\n",iRet);
     
    return 0;
}
