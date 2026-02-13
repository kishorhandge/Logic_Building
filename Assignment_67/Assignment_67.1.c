// ------------------------------------------------------------
// Question 1:
// Accept one number from user.
// Count number of ON (1) bits in that number.
// Do not use % or / operators.
// Use bitwise operations only.
// Return the count of ON bits.
// Example:
// Input  : 11
// Output : 3
// ------------------------------------------------------------



#include<stdio.h>

typedef unsigned int UINT;

int CountONBit(UINT iNo)
{
   int iCnt = 0;
   int iCount = 0;

   for(iCnt = 31;iCnt >= 0;iCnt--)
   {
        if((iNo >> iCnt) &1)
        {
            iCount++;
        }
   }
   return iCount;
 
}

int main()
{
    UINT iNo = 0;
    int iRet = 0;

    printf("Enter the Number : \n");
    scanf("%u",&iNo);

    iRet = CountONBit(iNo);

    printf("Numbe rof bits ON %d\n",iRet);

    return 0;
}
