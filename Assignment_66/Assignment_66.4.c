
// ------------------------------------------------------------
// Question 4:
// Accept one number and bit position from user.
// Toggle the bit at that position.
// If bit is ON make it OFF.
// If bit is OFF make it ON.
// Return the modified number.
// Example:
// Input  : 10  3
// Output : 14
// ------------------------------------------------------------



#include<stdio.h>

typedef unsigned int UINT;
typedef int BOOL;

#define TRUE 1
#define FALSE 0

UINT ToggleBit(UINT iNo, int iPos)
{
    UINT iMask = 0x1;
    UINT iResult = 0;

    iMask = iMask << (iPos - 1);

    iResult = iNo ^ ( iMask);

    return iResult;

}

int main()
{
    UINT iNo = 0;
    int iPos = 0;
    UINT iRet = 0;

    printf("Enter the Number :\n ");
    scanf("%u",&iNo);

    printf("Enter the Position :\n ");
    scanf("%d",&iPos);

    iRet = ToggleBit(iNo,iPos);

    printf("Modified number is : %U\n",iRet);

    return 0;
}
