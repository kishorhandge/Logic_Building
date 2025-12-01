#include<stdio.h>

int FirstChar(char str[],char ch)
{   
    int index = 0;

    while(*str != '\0')
    {   
        if((*str == ch) )
        {
            return index;
           
        }
        str++;
        index++;
       
    } 
    return -1;
}

int main()
{   
    char Arr[50] = {'\0'};
    char cValue = '\0';
    int iRet = 0;

    printf("Enter String :\n");
    scanf("%[^'\n']s",Arr);

    fflush(stdin);               

    printf("Enter Character :\n");
    scanf("%c",&cValue);

    iRet = FirstChar(Arr,cValue);

    printf("Character location is : %d\n",iRet);


    return 0;
}