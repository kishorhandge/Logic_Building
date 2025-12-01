#include <stdio.h>

void Display(char ch)
{
 
    int iCnt = 0;

    printf("ASCII Value are:\n");

    for (iCnt = 0; iCnt <= 127; iCnt++,ch++)
    {

        printf(" %d\t%x\t%c\t%o\n",ch, ch, ch, ch);
    }
}

int main()
{
    char cValue = '\0';

    Display(cValue);

    return 0;
}
