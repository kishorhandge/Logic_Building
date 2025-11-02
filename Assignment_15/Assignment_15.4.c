#include <stdio.h>

int MulDigits(int iNo)
{

    int iDigit = 0;
    int iMul = 1;
    int iNum = 1;

    while (iNo != 0)
    {
        iDigit = iNo % 10;
        if (iDigit != 0)
        {
            iNum = iDigit;
        }

        iMul=iMul*iNum;
        iNo = iNo / 10;
    }

    return iMul;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number\n");
    scanf("%d", &iValue);

    iRet = MulDigits(iValue);

    printf("%d", iRet);

    return 0;
}
//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Time complexity:O(logn)
//
//
/////////////////////////////////////////////////////////////////////////////////////////////////
