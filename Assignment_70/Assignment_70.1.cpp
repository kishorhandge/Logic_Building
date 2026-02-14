// ------------------------------------------------------------
// Question 1:
// Write a recursive program which accepts a number from user
// and displays numbers from that number down to 1.
// Example:
// Input  : 5
// Output : 5 * 4 * 3 * 2 * 1 *
// ------------------------------------------------------------



#include<iostream>
using namespace std;

void Display(int iNo)
{      

    if(iNo == 0)
    {
        return;
    }

     
    cout<<iNo<<"\t";
          
    
    cout<<"*\t";

    Display(--iNo);
    
    
}

int main()
{   
    int iNo = 0;

    cout<<"Enter the Number :"<<"\n";
    cin>>iNo;

    Display(iNo);

    return 0;
}