// ------------------------------------------------------------
// Write a recursive program which accepts a number from user
// and returns its reverse number.
//
// Input  : 523
// Output : 325
// ------------------------------------------------------------


#include<stdio.h>

void DisplayReverse(int iNo)
{      
    static int iDigit = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        printf("%d\t",iDigit);
        iNo = iNo / 10;

        DisplayReverse(iNo);
    }
    
}

int main()
{   
    int iValue = 0;

    printf("Enter the number : \n");
    scanf("%d",&iValue);
    
    DisplayReverse(iValue);

    return 0;
}