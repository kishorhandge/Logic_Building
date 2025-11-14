#include <stdio.h>
#include <stdlib.h>

void Digit(int Arr[], int iLength)
{
    int iCnt = 0;

    for (iCnt = 0; iCnt < iLength; iCnt++)
    {
        int iCount = 0;
        int iTemp = Arr[iCnt];

        while (iTemp != 0)
        {

            iTemp = iTemp / 10;
            iCount++;
        }
        if (iCount == 3)
        {
            printf(" 3 digit conatins number is:%d\n", Arr[iCnt]);
        }
    }
}

int main()
{
    int iSize = 0, iCnt = 0, iRet = 0;
    int *p = NULL;

    printf("Enter Number Of Elements:\n");
    scanf("%d", &iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if (p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter %d elements:\n", iSize);

    for (iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element : %d\n", iCnt + 1);
        scanf("%d", &p[iCnt]);
    }

    Digit(p, iSize);

    free(p);

    return 0;
}
