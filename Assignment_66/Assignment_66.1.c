
// ------------------------------------------------------------
// Question 1:
// Accept one number and bit position from user.
// Check whether bit at that position is ON or OFF.
// If bit is ON return TRUE.
// Otherwise return FALSE.
// Example:
// Input  : 10  2
// Output : TRUE
// ------------------------------------------------------------

#include<stdio.h>

typedef unsigned int UINT;
typedef int BOOL;

#define TRUE 1
#define FALSE 0

BOOL CheckBit(UINT iNo, int iPos)
{
    UINT iMask = 0x1;
    iMask = iMask << (iPos - 1);

    if((iNo & iMask) != 0)
        return TRUE;
    else
        return FALSE;
}

int main()
{
    UINT iNo = 0;
    int iPos = 0;
    BOOL bRet = FALSE;

    printf("Enter the Number :\n ");
    scanf("%d",&iNo);

    printf("Enter the Position :\n ");
    scanf("%d",&iPos);

    bRet = CheckBit(iNo,iPos);

    if(bRet == TRUE)
        printf("TRUE\n");
    else
        printf("FALSE\n");

    return 0;
}
