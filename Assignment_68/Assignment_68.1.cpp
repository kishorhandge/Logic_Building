// ------------------------------------------------------------
// Question 1:
// Write a recursive function to display 5 stars.
// Output : * * * * *
// Use recursion only (no loops).
// ------------------------------------------------------------

#include<iostream>
using namespace std;

void Display()
{      
    static int iCnt = 1;

    if(iCnt <= 5)
    {
        cout<<"*\t";
        iCnt++;
        Display();
    }
    
}

int main()
{
    Display();

    return 0;
}