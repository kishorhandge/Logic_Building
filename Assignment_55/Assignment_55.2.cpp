#include <iostream>
using namespace std;

template <class T>
T Sub(T no1,T no2)
{
    T Sub;

    Sub = no1 - no2;

    return (Sub);
}

int main()
{
    int iRet = Sub(20,10);
    printf("%d\n",iRet);

    float fRet = Sub(20.5f,10.3f);
    printf("%f\n",fRet);

    return 0;
}
