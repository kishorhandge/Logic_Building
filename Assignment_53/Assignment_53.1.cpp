#include <iostream>
using namespace std;

template <class T>
void CopyArray(T *src, T *dest, int iSize)
{
     
    for (int i = 0; i < iSize; i++)
    {   
        dest[i] = src[i];
    }

    cout<<"Copied Array is"<<"\n";
    
    for (int i = 0; i < iSize; i++)
    {   
        cout<<dest[i]<<" ";
    }
    cout<<endl;
     
}

int main()
{
    int arr[] = {10, 20, 30, 40, 50};
    int brr[5];

    CopyArray(arr,brr,5); 

    return 0;
}
