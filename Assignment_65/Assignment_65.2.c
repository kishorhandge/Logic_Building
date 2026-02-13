// ------------------------------------------------------------
// Question 2:
// Accept one number from user.
// Check 7th and 10th bits.
// If they are ON, turn both OFF.
// Return the modified number.
// Example:
// Input  : 577
// Output : 1
// ------------------------------------------------------------


#include<stdio.h>

typedef unsigned int UINT;

void OffBit(UINT iNo)
{
    UINT iMask = 0x00000240;        // 7th bit
    UINT iResult = 0;

    iResult = iNo & (~iMask);   // OFF operation

    printf("Result : %u\n", iResult);
}

int main()
{
    UINT iNo = 0;

    printf("Enter the Number : \n");
    scanf("%u",&iNo);

    OffBit(iNo);

    return 0;
}
