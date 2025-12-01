#include <stdio.h>

void Display(char *ch)
{
    if ((*ch >= 'A' && *ch <= 'Z'))
    {
        *ch = *ch + 32;
    }
    else if ((*ch >= 'a' && *ch <= 'z'))
    {
        *ch = *ch - 32;
    }
}

int main()
{
    char cValue = '\0';

    printf("Enter the character : \n");
    scanf("%c", &cValue);

    Display(&cValue);

    printf("Updated Character is:%c\n",cValue);

    return 0;
}
