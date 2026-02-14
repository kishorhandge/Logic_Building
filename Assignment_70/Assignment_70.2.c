// ------------------------------------------------------------
// Question 2:
// Write a recursive program which accepts a number from user
// and returns the summation of its digits.
// Example:
// Input  : 879
// Output : 24
// ------------------------------------------------------------


#include<stdio.h>

int Sum(int iNo)
{      
    static int iDigit = 0;
    static int iSum = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        iSum = iSum + iDigit;
        iNo = iNo / 10;

        Sum(iNo);
    }
    return iSum;
    
}

int main()
{   
    int iValue = 0;
    int iRet = 0;

    printf("Enter the number : \n");
    scanf("%d",&iValue);
    
    iRet = Sum(iValue);

    printf("%d\t",iRet);

    return 0;
}