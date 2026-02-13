// ------------------------------------------------------------
// Question 2:
// Write a recursive function to display numbers
// from 1 to 5 in increasing order.
// Output : 1 2 3 4 5
// Use recursion only (no loops).
// ------------------------------------------------------------


#include<iostream>
using namespace std;

void Display()
{      
    static int iCnt = 1;

    if(iCnt <= 5)
    {
        cout<<iCnt<<"\t";
        iCnt++;
        Display();
    }
    
}

int main()
{
    Display();

    return 0;
}