#include <iostream>
using namespace std;

template <class T>
T Div(T no1,T no2)
{
    T Div;

    Div = no1 / no2;

    return (Div);
}

int main()
{
    int iRet = Div(20,10);
    printf("%d\n",iRet);

    float fRet = Div(20.5f,10.3f);
    printf("%f\n",fRet);

    return 0;
}
