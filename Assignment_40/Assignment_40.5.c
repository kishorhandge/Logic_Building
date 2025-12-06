#include<stdio.h>

void Display(int iNo)
{  
    static char ch = 'a';

    if((ch-'a') <= iNo ) // ((0-0) <= 4)-->a
    {
        printf("%c\t",ch);
        ch++;
        Display(iNo);
    }
}

int main()
{   
    int iValue = 0;
    printf("Enter the number :\n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}