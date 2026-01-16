#include <iostream>
using namespace std;

template <class T>
void Swap(T &no1,T &no2)
{
    T temp;
    temp = no1;
    no1 = no2;
    no2 = temp;

}

int main()
{
    int a = 10, b = 20;

    cout<<"Before Swap :"<< a <<" "<< b <<" "<<"\n";
    Swap(a,b);
    cout<<"After Swap :"<< a <<" "<< b <<" "<<"\n";

    float x = 3.5f , y = 7.8f;

    cout<<"Before Swap :"<< x <<" "<< y <<" "<<"\n";
    Swap(a,b);
    cout<<"After Swap :"<< x <<" "<< y <<" "<<"\n";

    return 0;
}
