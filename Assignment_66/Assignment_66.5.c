
// ------------------------------------------------------------
// Question 5:
// Accept one number from user.
// Toggle contents of first nibble and last nibble of the number.
// Nibble means group of 4 bits.
// First nibble = lowest 4 bits.
// Last nibble = highest 4 bits.
// Return the modified number.
// ------------------------------------------------------------


#include<stdio.h>

typedef unsigned int UINT;
typedef int BOOL;

#define TRUE 1
#define FALSE 0

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0x1;
    UINT iResult = 0;

    iMask = 0xf000000f;

    iResult = iMask ^ iNo;

    return iResult;

}

int main()
{
    UINT iNo = 0;
    int iPos = 0;
    UINT iRet = 0;

    printf("Enter the Number :\n ");
    scanf("%u",&iNo);

    iRet = ToggleBit(iNo);

    printf("Modified number is : %u\n",iRet);

    return 0;
}
