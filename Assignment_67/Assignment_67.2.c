// ------------------------------------------------------------
// Question 2:
// Accept two numbers from user.
// Find positions where both numbers have ON (1) bits.
// Display all common ON bit positions.
// Use bitwise AND operation.
// Example:
// Input  : 10   15
// Output : 2 4
// ------------------------------------------------------------



#include<stdio.h>

typedef unsigned int UINT;

void DisplayBit(UINT iNo1,UINT iNo2)
{
   int iCnt = 0;
   UINT iResult = iNo1 & iNo2;
    
   for(iCnt = 0;iCnt < 32;iCnt++)
   {
        if((iResult & (1 << iCnt)) != 0)
        {
            printf("%d ",iCnt + 1); 
        }
   }
 
}

int main()
{
    UINT iNo1 = 0;
    UINT iNo2 = 0;

    printf("Enter the First Number : \n");
    scanf("%u",&iNo1);

    printf("Enter the Second Number : \n");
    scanf("%u",&iNo2);

    DisplayBit(iNo1,iNo2);

    return 0;
}
