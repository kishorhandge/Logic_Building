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
    Accept the String from user
    convert it into small character
    Perform the Operation
    Display the result on console
STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  StrlwrX
//  Description:    It is use to count capital character
//  Input:          String
//  Output:         void
//  Author:         Kishor Suryabhan Handge
//  Date:           30/11/2025
/////////////////////////////////////////////////////////////////////////////////////////////////

#include <stdio.h>

void StrlwrX(char str[])
{
    int iCnt = 0;
    
    while (*str != '\0')
    {
        if ((*str >= 'A' && *str <= 'Z'))
        {
            *str = *str + 32;
        }

        str++;
    }
}

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter the String : \n");
    scanf("%[^'\n']s", Arr);

    StrlwrX(Arr);

    printf("modified string is :%s\n", Arr);

    return 0;
}
