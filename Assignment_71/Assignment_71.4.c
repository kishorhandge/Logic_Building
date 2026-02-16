// ------------------------------------------------------------
// Write a recursive program which accepts a number from user
// and returns the smallest digit from that number.
//
// Input  : 87983
// Output : 3
// ------------------------------------------------------------


#include<stdio.h>
#include <limits.h>

int SmallestDigit(int iNo)
{      
    static int iDigit = 0;
    static int iMin = INT_MAX ;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit < iMin)
        {
            iMin = iDigit;
        }
        iNo = iNo / 10;

        SmallestDigit(iNo);
    }
    return iMin;
    
}

int main()
{   
    int iValue = 0;
    int iRet = 0;

    printf("Enter the number : \n");
    scanf("%d",&iValue);
    
    iRet = SmallestDigit(iValue);

    printf("Smallest Digit is : %d\t",iRet);

    return 0;
}