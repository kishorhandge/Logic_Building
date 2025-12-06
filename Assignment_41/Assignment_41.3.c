#include <stdio.h>

int Display(char *str)
{
    static int iCount = 0;

    if (*str != '\0')
    {   
        iCount++;
        str++;
        Display(str);
        
    }

    return iCount;
}

int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter the String : \n");
    scanf("%[^'\n']s", Arr);

    iRet = Display(Arr);

    printf("%d\n", iRet);

    return 0;
}