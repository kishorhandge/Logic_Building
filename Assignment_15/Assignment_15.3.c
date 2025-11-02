#include <stdio.h>

int CountRange(int iNo)
{

    int iDigit = 0;
    int iFrequency = 0;

    while (iNo != 0)
    {
        iDigit = iNo % 10;

        if (iDigit>3 && iDigit<7)
        {
            iFrequency++;
        }

        iNo = iNo / 10;
    }

    return iFrequency;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number\n");
    scanf("%d", &iValue);

    iRet = CountRange(iValue);

    printf("%d", iRet);

    return 0;
}
//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Time complexity:O(logn)
//
//
/////////////////////////////////////////////////////////////////////////////////////////////////
