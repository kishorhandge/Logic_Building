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
    cpopy that string into another string in reverse order
    Perform the Operation
    Display the result on console
STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  StrCpyRev
//  Description:    It is use to reverse the string
//  Input:          String
//  Output:         String
//  Author:         Kishor Suryabhan Handge
//  Date:           1/12/2025
/////////////////////////////////////////////////////////////////////////////////////////////////

#include <stdio.h>

void StrCpyRev(char *src ,char *dest)
{
    char *temp = src;

    while (*temp != '\0')
    {   
        temp++;
    }
    
    temp--;

    while(temp >= src)
    {
        *dest = *temp;
        dest++;
        temp--;
    }
   
   *dest = '\0';

}

int main()
{
    char Arr[30] = "Marvellous Python";
    char Brr[30] ;

    StrCpyRev(Arr,Brr);

    printf("Updated string is :%s\n", Brr);

    return 0;
}
