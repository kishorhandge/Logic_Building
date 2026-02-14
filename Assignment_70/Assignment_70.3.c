// ------------------------------------------------------------
// Write a recursive program which accepts a string from user
// and counts the total number of characters.
//
// Input  : Hello
// Output : 5
// ------------------------------------------------------------


#include<stdio.h>

int CountCharacter(char str[])
{      
    static int iCount = 0;

    if(*str == '\0')
    {   
        return iCount;
    }
    iCount++;

    return CountCharacter(str + 1);
  
}

int main()
{   
    char String[100];
    int iRet = 0;

    printf("Enter the string : \n");
    scanf("%s",String);
    
    iRet = CountCharacter(String);

    printf("%d\t",iRet);

    return 0;
}