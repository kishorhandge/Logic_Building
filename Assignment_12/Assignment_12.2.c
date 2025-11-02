#include <stdio.h>

int Count_Factors(int number)
{
    int iCnt = 0;
    int Count = 0;

    if(number<0)
    {
        printf("Invalid Input");
    }
    
    for (iCnt = 1; iCnt < number; iCnt++)
    {
        if (number % iCnt == 0)
        {
            Count++;
        }
    }

    return Count;
}

int main()
{
    int number = 0;

    printf("Enter number\n");
    scanf("%d", &number);

    printf("%d\n", Count_Factors(number));

    return 0;
}
//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Time complexity:O(n)
//
//
/////////////////////////////////////////////////////////////////////////////////////////////////
