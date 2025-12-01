#include <stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkVowel(char str[])
{
    int iCnt = 0;
    int iCount1 = 0;
    int iCount2 = 0;

    while (*str != '\0')
    {
        if ((*str == 'a') || (*str == 'e') || (*str == 'i') || (*str == 'o') || (*str == 'u') ||
            (*str == 'A') || (*str == 'E') || (*str == 'I') || (*str == 'O') || (*str == 'U'))
        {
            return TRUE;
        }
        
        str++;
    }
    return FALSE;
}

int main()
{
    char Arr[50] = {'\0'};
    BOOL bRet = FALSE;

    printf("Enter the String : \n");
    scanf("%[^'\n']s", Arr);

    bRet = ChkVowel(Arr);

    if (bRet == TRUE)
    {
        printf("Contains Vowel:\n");
    }
    else
    {
        printf("There is No Contains Vowel:\n");
    }

    return 0;
}
