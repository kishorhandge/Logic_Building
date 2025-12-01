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
    count number of capital character
    Perform the Operation
    Display the result on console
STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  CountCapital
//  Description:    It is use to count capital character
//  Input:          String
//  Output:         Int
//  Author:         Kishor Suryabhan Handge
//  Date:           30/11/2025
/////////////////////////////////////////////////////////////////////////////////////////////////

#include <stdio.h>

int CountCapital(char str[])
{
    int iCnt = 0;
    int iCount = 0;
    
    while (*str != '\0')
    {
        if ((*str >= 'A' && *str <= 'Z'))
        {
            iCount++;
        }

        str++;
    }
    return iCount;
}

int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter the String : \n");
    scanf("%[^'\n']s", Arr);

    iRet = CountCapital(Arr);

    printf("Count of capital character :%d\n", iRet);

    return 0;
}
