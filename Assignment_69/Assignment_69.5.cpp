// ------------------------------------------------------------
// Question 5:
// Write a recursive program to display first N small alphabets.
// Example:
// Input  : 6
// Output : a b c d e f
// ------------------------------------------------------------


#include<iostream>
using namespace std;

void Display(int iNo)
{      
    static char ch = 'a';

    if(ch <= 'f')
    {
        cout<<ch<<"\t";
        ch++;
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