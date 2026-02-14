// ------------------------------------------------------------
// Question 2:
// Write a recursive program to display numbers
// from 1 up to the given number.
// Example:
// Input  : 5
// Output : 1 2 3 4 5
// ------------------------------------------------------------



#include<iostream>
using namespace std;

void Display(int iNo)
{      
    static int iCnt = 1;

    if(iCnt <= iNo)
    {
        cout<<iCnt<<"\t";
        iCnt++;
        Display(iNo);
    }
    
}

int main()
{   
    int iNo = 0;

    cout<<"Enter the Number :"<<"\n";
    cin>>iNo;

    Display(iNo);

    return 0;
}