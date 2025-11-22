#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt = 0;
    char ch = '\0';
    ch = 'A';
    
    for(iCnt = 1;iCnt<=iNo;iCnt++)
    {
        printf("%c\t",ch);
        ch++;
    }
}

int main()
{
    int iValue = 0;

    printf("Enter the number of elements :\n");
    scanf("%d",&iValue);

    Pattern(iValue);
    return 0;
}