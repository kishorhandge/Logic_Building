// ------------------------------------------------------------
// Write a recursive program which accepts a number from user
// and returns its factorial.
//
// Input  : 5
// Output : 120
// ------------------------------------------------------------


#include<stdio.h>

int Factorial(int iNo)
{      
    static int iFact = 1;

    if(iNo >= 1)
    {
        iFact = iFact * iNo;

        Factorial(--iNo);
    }
    return iFact;
    
}

int main()
{   
    int iValue = 0;
    int iRet = 0;

    printf("Enter the number : \n");
    scanf("%d",&iValue);
    
    iRet = Factorial(iValue);

    printf("Factorial is : %d\t",iRet);

    return 0;
}