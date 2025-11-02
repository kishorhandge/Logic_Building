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
    If the input  is negative then make it positive
    Perform the Operation
    Display the even factors of that number

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
//  Function Name:  DisplayFactors
//  Description:    It is use to print the even factorsof the number
//  Input:          int
//  Output:         int
//  Author:         Kishor Suryabhan Handge
//  Date:           19/10/2025
/////////////////////////////////////////////////////////////////////////////////////////////////

void DisplayFactors(int iNo)
{
    int iCnt = 0;

    // Filter

    if (iNo <= 0)
    {
        iNo = -iNo;
    }

    for (iCnt = 1; iCnt <= (iNo / 2); iCnt++)
    {
        if ((iNo % iCnt == 0)&&(iCnt%2==0))
        {
            printf("%d\t", iCnt);
        } // Buisness Logic
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

    DisplayFactors(iValue);

    return 0;
}
