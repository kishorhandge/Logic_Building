#include <iostream>
using namespace std;

template <class T>
T Add(T no1,T no2)
{
    T Sum;

    Sum = no1 + no2;

    return Sum;
}

int main()
{
    int iRet = Add(10,20);
    printf("%d\n",iRet);

    float fRet = Add(10.5f,20.3f);
    printf("%f\n",fRet);

    return 0;
}
