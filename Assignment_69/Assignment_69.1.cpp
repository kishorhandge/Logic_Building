// ------------------------------------------------------------
// Question 1:
// Write a recursive program to display given number of stars.
// Accept number from user and print that many '*' symbols.
// Example:
// Input  : 5
// Output : * * * * *
// ------------------------------------------------------------


#include<iostream>
using namespace std;

void Display(int iNo)
{      
    static int iCnt = 1;

    if(iCnt <= iNo)
    {
        cout<<"*\t";
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