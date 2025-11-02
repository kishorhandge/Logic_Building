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
    Accept the character from user
    If the input case is smaller(a) make it capital(A), if input case is capital(A) make it smaller(a) 
    Perform the Operation
    Display the desire character on display

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
//  Function Name:  DisplayConvert
//  Description:    It is use to print the character on the display
//  Input:          char
//  Output:         char
//  Author:         Kishor Suryabhan Handge
//  Date:           19/10/2025
/////////////////////////////////////////////////////////////////////////////////////////////////

void DisplayConvert(char cValue)
{
    if(cValue=='a')
    {
        printf("%c",'A');
    }
    else if(cValue=='D')
    {
        printf("%c",'d');
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Function for the application
//
/////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int cValue = '\0';

    printf("Enter the Character\n");
    scanf("%c", &cValue);

    DisplayConvert(cValue);

    return 0;
}
