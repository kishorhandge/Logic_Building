#include <iostream>
using namespace std;

template <class T>
void Replace(T *arr,int iSize,T oldval,T newval)
{   
    for (int i = 0; i < iSize; i++)
    {   
        if(arr[i] == oldval)
        {
            arr[i] = newval;
        }
    }
    
     
}

int main()
{
    int arr[] = {10, 20, 30, 40, 50};

    Replace(arr,5,30,333); 

    for (int i = 0; i < 5; i++)
    {   
        cout<<arr[i]<<" ";
    }
    
     
    return 0;
}
