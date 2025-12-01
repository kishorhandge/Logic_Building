#include <stdio.h>

int CountDifference(char str[])
{
    int iCnt = 0;
    int iCount1 = 0;
    int iCount2 = 0;

    while (*str != '\0')
    {
        if ((*str >= 'a' && *str <= 'z'))
        {
            iCount1++;
        }
        else if ((*str >= 'A' && *str <= 'Z'))
        {
            iCount2++;
        }

        str++;
    }
    return (iCount1 - iCount2);
}

int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter the String : \n");
    scanf("%[^'\n']s", Arr);

    iRet = CountDifference(Arr);

    printf("Difference of Small and capital character :%d\n", iRet);

    return 0;
}
