// ------------------------------------------------------------
// Question 1:
// Accept one number from user.
// Check if 7th bit is ON.
// If it is ON, turn it OFF.
// Return the modified number.
// Example:
// Input  : 79
// Output : 15
// ------------------------------------------------------------


#include<stdio.h>

typedef unsigned int UINT;

void OffBit(UINT iNo)
{
    UINT iMask = 0x40;        // 7th bit
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
