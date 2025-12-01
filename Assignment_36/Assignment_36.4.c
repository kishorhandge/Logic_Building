#include <stdio.h>

void Display(char str[])
{
    int iCnt = 0;

    while (*str != '\0')
    {
        if ((*str >= '0' && *str <= '9'))
        {
            printf("%c", *str);
        }

        str++;
    }
}

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter the String : \n");
    scanf("%[^'\n']s", Arr);

    Display(Arr);

    return 0;
}
