// ------------------------------------------------------------
// Question 4:
// Accept one number from user.
// Toggle both 7th and 10th bits.
// If bit is ON make it OFF.
// If bit is OFF make it ON.
// Return the modified number.
// Example:
// Input  : 137
// Output : 713
// ------------------------------------------------------------




#include<stdio.h>

typedef unsigned int UINT;

void OffBit(UINT iNo)
{
    UINT iMask = 0x00000240;      
    UINT iResult = 0;

    iResult = (iNo ^ (iMask));   

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
