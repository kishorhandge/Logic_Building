#include<iostream>
using namespace std;

template <class T>

int SearchLast(T *arr,int iSize,T iNo)
{
    int iCnt = 0;
    int Pos = 0;
    int Lastpos = 0;

    for(iCnt = 0;iCnt<iSize;iCnt++)
    {
        if(arr[iCnt] == iNo)
        {
           Lastpos = Pos;
        }
        Pos++;
        
    }
   return Lastpos;
}

int main()
{
    int arr[] = {10,20,30,10,30,10,40,10,40,10};

    int iRet = SearchLast(arr,9,40);

    printf("%d",iRet);//6

    return 0;
}
