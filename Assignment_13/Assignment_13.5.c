#include <stdio.h>

int Sum_natural_Numbers(int limit)
{

    int iCnt = 0;
    int Sum = 0;

    for (iCnt = 1; iCnt <= limit; iCnt++)
    {
        if (iCnt % 2 == 0)
        {
            Sum = Sum + iCnt;
        }
    }

    return Sum;
}

int main()
{
    int limit;

    printf("Enter number\n");
    scanf("%d", &limit);

    printf("%d", Sum_natural_Numbers(limit));

    return 0;
}
//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Time complexity:O(n)
//
//
/////////////////////////////////////////////////////////////////////////////////////////////////
