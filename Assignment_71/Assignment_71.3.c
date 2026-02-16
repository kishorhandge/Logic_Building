// ------------------------------------------------------------
// Write a recursive program which accepts a string from user
// and counts number of small (lowercase) characters.
//
// Input  : "HelloWorld"
// Output : 5
// ------------------------------------------------------------


#include <stdio.h>

int CountSmall(char *str)
{

    if (*str == '\0')
    {
        return 0;
    }

    return (*str >= 'a' && *str <= 'z') + CountSmall(str + 1);
}

int main()
{
    char String[100];
    int iRet = 0;

    printf("Enter the string : \n");
    scanf("%[^\n]", String);

    iRet = CountSmall(String);

    printf("%d\t", iRet);

    return 0;
}