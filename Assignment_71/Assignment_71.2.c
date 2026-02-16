// ------------------------------------------------------------
// Write a recursive program which accepts a number from user
// and returns the largest digit from that number.
//
// Input  : 87983
// Output : 9
// ------------------------------------------------------------

#include<stdio.h>

int LargestDigit(int iNo)
{      
    static int iDigit = 0;
    static int iMax = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit > iMax)
        {
            iMax = iDigit;
        }
        iNo = iNo / 10;

        LargestDigit(iNo);
    }
    return iMax;
    
}

int main()
{   
    int iValue = 0;
    int iRet = 0;

    printf("Enter the number : \n");
    scanf("%d",&iValue);
    
    iRet = LargestDigit(iValue);

    printf("Largest Digit is : %d\t",iRet);

    return 0;
}