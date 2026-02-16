// ------------------------------------------------------------
// Write a recursive program which accepts a string from user
// and counts number of white spaces in it.
//
// Input  : "Hi Hello World"
// Output : 2
// ------------------------------------------------------------

#include <stdio.h>

int CountSpace(char *str)
{

    if (*str == '\0')
    {
        return 0;
    }

    return (*str == ' ') + CountSpace(str + 1);
}

int main()
{
    char String[100];
    int iRet = 0;

    printf("Enter the string : \n");
    scanf("%[^\n]", String);

    iRet = CountSpace(String);

    printf("%d\t", iRet);

    return 0;
}