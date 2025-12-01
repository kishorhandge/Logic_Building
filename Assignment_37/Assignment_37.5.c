#include <stdio.h>

void StrCpyRev(char *src, char *dest)
{
    while (*src != '\0')
    {
        if (*src >= 'A' && *src <= 'Z')
        {
            *dest = *src + 32;
        }
        else if  (*src >= 'a' && *src <= 'z')
        {
            *dest = *src - 32;
        }
        else
        {
            *dest = *src;
        }

        dest++;
        src++;
    }

    *dest = '\0';
}

int main()
{
    char Arr[30] = "Marvellous Python";
    char Brr[30];

    StrCpyRev(Arr, Brr);

    printf("Updated string is :%s\n", Brr);

    return 0;
}
