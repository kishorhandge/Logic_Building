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
    Accept the number as no and display its  multiplication factors
    Perform the Operation
    Display the multiplication factors of that number on Console

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
//  Function Name:  MultFact
//  Description:    It is use find the multiplication factors
//  Input:          int
//  Output:         int
//  Author:         Kishor Suryabhan Handge
//  Date:           20/10/2025
/////////////////////////////////////////////////////////////////////////////////////////////////

int MultFact(int iNo)
{
    int iCnt = 0;
    int iMul=1;

    for (iCnt = 1; iCnt <=(iNo/2); iCnt++)
    {
        if (iNo % iCnt == 0)
        {
             
            iMul=iMul*iCnt;
        }
    }
    return iMul;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Function for the application
//
/////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;
    int iRet = 0;  

    printf("Enter the Number\n");
    scanf("%d", &iValue);

     
    iRet = MultFact(iValue); 

     
    printf("%d\n", iRet);

    return 0;
}