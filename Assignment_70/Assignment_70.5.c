// ------------------------------------------------------------
// Write a recursive program which accepts a number from user
// and returns the product of its digits.
//
// Input  : 523
// Output : 30
// ------------------------------------------------------------


#include<stdio.h>

int Product(int iNo)
{      
    static int iDigit = 0;
    static int iMul = 1;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        iMul = iMul * iDigit;
        iNo = iNo / 10;

        Product(iNo);
    }
    return iMul;
    
}

int main()
{   
    int iValue = 0;
    int iRet = 0;

    printf("Enter the number : \n");
    scanf("%d",&iValue);
    
    iRet = Product(iValue);

    printf("%d\t",iRet);

    return 0;
}