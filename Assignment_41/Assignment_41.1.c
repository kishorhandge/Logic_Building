#include<stdio.h>

void Display(int iNo)
{   
    int i = 1;

    if(iNo>=i)
    {
        printf("%d\t*\t",iNo);
        i++;
        iNo--;
        Display(iNo);
    }
        
}

int main()
{
    int iValue = 0;

    printf("Enter the number : \n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}