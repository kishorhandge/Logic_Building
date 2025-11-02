#include <stdio.h>

int Sum_Of_Factors(int number)
{
    int iCnt = 0;
    int Sum = 0;

    if (number < 0)
    {
        printf("Invalid Input");
    }

    for (iCnt = 1; iCnt < number; iCnt++)
    {
        if (number % iCnt == 0)
        {
            Sum = Sum + iCnt;
        }
    }

    return Sum;
}

int main()
{
    int number = 0;

    printf("Enter number\n");
    scanf("%d", &number);

    printf("%d\n", Sum_Of_Factors(number));

    return 0;
}
//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Time complexity:O(n)
//
//
/////////////////////////////////////////////////////////////////////////////////////////////////
