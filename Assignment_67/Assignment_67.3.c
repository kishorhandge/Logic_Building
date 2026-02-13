// ------------------------------------------------------------
// Question 3:
// Accept one number from user.
// Check whether 9th or 12th bit is ON or OFF.
// If any one bit is ON, return TRUE.
// Otherwise return FALSE.
// Use bitwise mask.
// Example:
// Input  : 257
// Output : TRUE
// ------------------------------------------------------------



#include<stdio.h>

typedef unsigned int UINT;

typedef int BOOL;

#define TRUE 1
#define FALSE 0

BOOL CheckBit(UINT iNo)
{
    int iMask = 0x1;
    UINT iResult = 0;

    iMask = 0x00000900;

    iResult = iMask & iNo;

    if(iResult != 0)
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
    UINT iNo1 = 0;
    BOOL bRet = FALSE;

    printf("Enter the Number : \n");
    scanf("%u",&iNo1);

    bRet = CheckBit(iNo1);

    if(bRet == TRUE)
    {
        printf("TRUE\n");
    }
    else
    {
        printf("FALSE\n");
    }

    return 0;
}
