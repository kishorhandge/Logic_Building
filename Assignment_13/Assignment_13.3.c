#include <stdio.h>

void Print_Odd_Numbers(int limit)
{

    int iCnt = 0;

    for (iCnt = 1; iCnt <= limit; iCnt++)
    {
        if (iCnt % 2 != 0)
        {
            printf("%d\t", iCnt);
        }
    }
}

int main()
{
    int limit;

    printf("Enter number\n");
    scanf("%d", &limit);

    Print_Odd_Numbers(limit);

    return 0;
}
//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Time complexity:O(n)
//
//
/////////////////////////////////////////////////////////////////////////////////////////////////
