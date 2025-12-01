#include <stdio.h>

void StruprX(char str[])
{
    int iCnt = 0;
    
    while (*str != '\0')
    {
        if ((*str >= 'a' && *str <= 'z'))
        {
            *str = *str - 32;
        }

        str++;
    }
}

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter the String : \n");
    scanf("%[^'\n']s", Arr);

    StruprX(Arr);

    printf("modified string is :%s\n", Arr);

    return 0;
}
