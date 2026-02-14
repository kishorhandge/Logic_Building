// ------------------------------------------------------------
// Question 3:
// Write a recursive program to display numbers
// from the given number down to 1.
// Example:
// Input  : 5
// Output : 5 4 3 2 1
// ------------------------------------------------------------


#include<iostream>
using namespace std;

void Display(int iNo)
{      

    if(iNo >= 1)
    {
        cout<<iNo<<"\t";
        iNo--;
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