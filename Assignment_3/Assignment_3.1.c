/*
Step 1:Understand the problem statement
Step 2:Write the algorithm
Step 3:Decide the programming language
Step 4:Write the program
Step 5:Test the program
*/

/*
Algorithm:
START
    Accept the number as no
    If the input  is zero or negative then reject it
    Perform the Operation
    Display the even numbers of that number on Console

STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Header Files;
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include <stdio.h>

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  PrintEven
//  Description:    It is use to print the even number on display
//  Input:          int
//  Output:         int
//  Author:         Kishor Suryabhan Handge
//  Date:           19/10/2025
/////////////////////////////////////////////////////////////////////////////////////////////////

void PrintEven(int iNo)
{
    int iCnt = 0;

    // Filter

    if (iNo <= 0)
    {
        return;
    }

    for (iCnt = 1; iCnt <= iNo; iCnt++)
    {

        printf("%d\t", iCnt * 2);                             //Buisness Logic
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Function for the application
//
/////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;

    printf("Enter the Number\n");
    scanf("%d", &iValue);

    PrintEven(iValue);

    return 0;
}
