/*
Step 1:Understand the problem statement
Step 2:Write the algorithm
Step 3:Decide the programming language
Step 4:Write the program
Step 5:Test the program
*/

#include<stdio.h>

void Display(int iNo)
{   
    static int iCnt = 1;

    if(iCnt<=iNo)
    {
        printf("*\t");
        iCnt++;
        Display(iNo);
    }
}

int main()
{   
    int iValue = 0;
    printf("Enter the number :\n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}