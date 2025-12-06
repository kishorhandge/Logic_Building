/*
Step 1:Understand the problem statement
Step 2:Write the algorithm
Step 3:Decide the programming language
Step 4:Write the program
Step 5:Test the program
*/

#include<stdio.h>

void Display()
{   
    static int i = 1;

    if(i<=5)
    {
        printf("*\t");
        i++;
        Display();
    }
}

int main()
{   
    Display();

    return 0;
}