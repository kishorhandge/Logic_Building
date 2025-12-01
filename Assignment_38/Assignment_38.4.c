#include <stdio.h>

int LastChar(char str[], char ch)
{
    int index = 0;
    int SlastIndex = -1;

    while (str[index] != '\0')
    {
        if ((str[index] == ch))
        {
            SlastIndex = index;
        }
        index++;
    }

    return SlastIndex;
}

int main()
{
    char Arr[50] = {'\0'};
    char cValue = '\0';
    int iRet = 0;

    printf("Enter String :\n");
    scanf("%[^'\n']s", Arr);

    fflush(stdin);

    printf("Enter Character :\n");
    scanf("%c", &cValue);

    iRet = LastChar(Arr, cValue);

    printf("Last Occurance is : %d\n", iRet);

    return 0;
}