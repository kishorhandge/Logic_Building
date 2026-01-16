#include <iostream>
using namespace std;

template <class T>
T Min(T *arr, int iSize)
{
    T Small = arr[0];

    for (int i = 0; i < iSize; i++)
    {
        if (arr[i] < Small)
        {
            Small = arr[i];
        }
    }
     
    return Small;
}

int main()
{
    int arr[] = {11, 20, 13, 40, 50};
    int iRet = 0;

    iRet = Min(arr, 5);

    cout<<"Smallest Number is: "<<iRet<<"\n";

    return 0;
}
