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
    Accept the first number as no1
    Accept the second number as no2
    If the input  is negative then reject it
    Perform the division of no1 and no2
    Display the division on Screen

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
//  Function Name:  Divide  
//  Description:    It is use to perform division
//  Input:          int,int
//  Output:         int
//  Author:         Kishor Suryabhan Handge
//  Date:           18/10/2025
/////////////////////////////////////////////////////////////////////////////////////////////////

int Divide(int iNo1, int iNo2)
{
    int iAns = 0;

    //Updater
    
    if (iNo2 < 0)
    {
        return -1;
    }

    iAns = iNo1 / iNo2;                         //Buisness Logic

    return iAns;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Function for the application
//
/////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue1 = 15, iValue2 = 5;

    int iRet = 0;

    iRet = Divide(iValue1, iValue2);

    printf("Division is %d", iRet);

    return 0;
}
