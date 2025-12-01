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
    Accept the String from user and character from user
    and check character present in that string or not
    Perform the Operation
    Display the result on console
STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  ChkChar
//  Description:    It is use to found character
//  Input:          String
//  Output:         String
//  Author:         Kishor Suryabhan Handge
//  Date:           1/12/2025
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkChar(char str[],char ch)
{   

    while(*str != '\0')
    {   
        if((*str == ch) )
        {
            return TRUE;
           
        }
        str++;
       
    } 
    return FALSE;  
}

int main()
{   
    char Arr[50] = {'\0'};
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter String :\n");
    scanf("%[^'\n']s",Arr);

    fflush(stdin);              

    printf("Enter Character :\n");
    scanf("%c",&cValue);

    bRet = ChkChar(Arr,cValue);

    if(bRet == TRUE)
    {
        printf("Chracter found:\n");
    }
    else
    {
        printf("Chracter not found:\n");
    }


    return 0;
}