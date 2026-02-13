// ------------------------------------------------------------
// Question 4:
// Accept one number and two bit positions from user.
// Check whether bit at first position OR second position is ON.
// If any one bit is ON, return TRUE.
// Otherwise return FALSE.
// Use bitwise operations.
// Example:
// Input  : 10   3   7
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
