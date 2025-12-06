#include <stdio.h>

int Display(int iNo)
{
    static int iFactorial = 1;

    if(iNo >= 1)
    {
        iFactorial = iFactorial * iNo;
        iNo--;
        Display(iNo);
    }

    return iFactorial;
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