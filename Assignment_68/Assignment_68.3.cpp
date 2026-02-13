// ------------------------------------------------------------
// Question 3:
// Write a recursive function to display numbers
// from 5 to 1 in decreasing order.
// Output : 5 4 3 2 1
// Use recursion only (no loops).
// ------------------------------------------------------------


#include<iostream>
using namespace std;

void Display()
{      
    static int iCnt = 5;

    if(iCnt >= 1)
    {
        cout<<iCnt<<"\t";
        iCnt--;
        Display();
    }
    
}

int main()
{
    Display();

    return 0;
}