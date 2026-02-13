
// ------------------------------------------------------------
// Question 2:
// Accept one number and bit position from user.
// Turn OFF (clear) the bit at that position.
// Return the modified number.
// Example:
// Input  : 10  2
// Output : 8
// ------------------------------------------------------------


#include<stdio.h>

typedef unsigned int UINT;
typedef int BOOL;

#define TRUE 1
#define FALSE 0

UINT OffBit(UINT iNo, int iPos)
{
    UINT iMask = 0x1;
    UINT iResult = 0;

    iMask = iMask << (iPos - 1);

    iResult = iNo & (~ iMask);

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

    iRet = OffBit(iNo,iPos);

    printf("Modified number is : %u\n",iRet);

    return 0;
}
