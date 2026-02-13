// ------------------------------------------------------------
// Question 3:
// Accept one number from user.
// Toggle the 7th bit (ON -> OFF, OFF -> ON).
// Return the modified number.
// Example:
// Input  : 137
// Output : 201
// ------------------------------------------------------------



#include<stdio.h>

typedef unsigned int UINT;

void OffBit(UINT iNo)
{
    UINT iMask = 0x00000040;        // 7th bit
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
