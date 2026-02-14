// ------------------------------------------------------------
// Question 4:
// Write a recursive program to display first N capital alphabets.
// Example:
// Input  : 6
// Output : A B C D E F
// ------------------------------------------------------------


#include<iostream>
using namespace std;

void Display(int iNo)
{      
    static char ch = 'A';

    if(ch <= 'F')
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