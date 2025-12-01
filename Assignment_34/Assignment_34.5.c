#include <stdio.h>

void Display(char ch)
{   
    char i = '\0';

    if ((ch >= 'A' && ch <= 'Z'))
    {   
        printf("Decimal ASCII Value is: %d\n",ch);
        printf("HexaDecimal ASCII Value is: %x\n",ch);
        printf("Octal ASCII Value is: %o\n",ch);   
    }
    else
    {
        return;
    }
     
}

int main()
{
    char cValue = '\0';

    printf("Enter the character : \n");
    scanf("%c", &cValue);

    Display(cValue);

    return 0;
}
