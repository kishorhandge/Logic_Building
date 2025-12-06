#include <stdio.h>

int Display(int iNo)
{
    int iDigit = 0;
    static int iMul = 1;

    if (iNo != 0)
    {
        iDigit = iNo % 10;
        iMul = iMul * iDigit;
        iNo = iNo / 10;
        Display(iNo);
    }

    return iMul;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter the number : \n");
    scanf("%d", &iValue);

    iRet = Display(iValue);

    printf("%d\n", iRet);

    return 0;
}