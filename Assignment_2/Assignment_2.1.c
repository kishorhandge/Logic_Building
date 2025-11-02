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
    If the input  is negative then Make it positive
    Perform the Operation
    Display the * on Console

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
//  Function Name:  Display 
//  Description:    It is use to take number from user and print the *
//  Input:          int
//  Output:         *
//  Author:         Kishor Suryabhan Handge
//  Date:           18/10/2025
/////////////////////////////////////////////////////////////////////////////////////////////////

int Display(int iNo)
{
    int iCnt = 0;

    //Updater
    
    if (iNo < 0)
    {
        iNo=-iNo;
    }

    while(iCnt<iNo)
    {
        printf("*\t");      //Buisness Logic
        iCnt++;
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
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}