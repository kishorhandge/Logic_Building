// ------------------------------------------------------------
// Question 5:
// Accept one number from user.
// Turn ON first 4 bits of the number.
// Return the modified number.
// Example:
// Input  : 73
// Output : 79
// ------------------------------------------------------------


#include<stdio.h>

typedef unsigned int UINT;

void OffBit(UINT iNo)
{
    UINT iMask = 0x0000000f;      
    UINT iResult = 0;

    iResult = (iNo | (iMask));   

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
