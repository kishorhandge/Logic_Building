// ------------------------------------------------------------
// Question 4:
// Write a recursive function to display capital alphabets
// from A to F.
// Output : A B C D E F
// Use recursion only (no loops).
// ------------------------------------------------------------



#include<iostream>
using namespace std;

void Display()
{      
    static char Ch = 'A';

    if(Ch <= 'F')
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