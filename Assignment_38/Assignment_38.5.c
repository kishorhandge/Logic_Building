#include <stdio.h>

void StrRevX(char str[])
{
    char *start = str;
    char *end = str;

    char temp = '\0';

    while (*end != '\0')
    {
        end++;
    }
    end--;

    while (start < end)
    {
        temp = *start;
        *start = *end;
        *end = temp;

        start++;
        end--;
    }
    printf("\n");
}

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter String :\n");
    scanf("%[^'\n']s", Arr);

    StrRevX(Arr);

    printf("Modified String is : %s\n", Arr);

    return 0;
}