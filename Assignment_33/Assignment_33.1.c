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
    Accept the Character from user and check wheather it is alphabet or not
    Perform the Operation
    Display the result on console
STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  ChkAlpha
//  Description:    It is use to check alphabet or not
//  Input:          String
//  Output:         TRUE/FALSE
//  Author:         Kishor Suryabhan Handge
//  Date:           28/11/2025
///////////////////////////////////////////////////////////////////////////////////////////////// 
 
#include<stdio.h>
 
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkAlpha(char ch)
{
    if((ch >= 'a' && ch <= 'z'))
    {
        return TRUE;
    }
    else if((ch >= 'A' && ch <= 'Z'))
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }

}

int main()
{   
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter the character : \n");
    scanf("%c",&cValue);

    bRet = ChkAlpha(cValue);

    if(bRet == TRUE)
    {
        printf("It is a character:\n");
    }
    else
    {
        printf("It is not a character:\n");
    }

    return 0;
}
 

 

 
 
