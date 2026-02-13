// ------------------------------------------------------------
// Question 5:
// Write a recursive function to display small alphabets
// from a to f.
// Output : a b c d e f
// Use recursion only (no loops).
// ------------------------------------------------------------


#include<iostream>
using namespace std;

void Display()
{      
    static char Ch = 'a';

    if(Ch <= 'f')
    {
        cout<<Ch<<"\t";
        Ch++;
        Display();
    }
    
}

int main()
{
    Display();

    return 0;
}