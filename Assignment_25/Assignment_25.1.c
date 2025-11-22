/*
Step 1:Understand the problem statement
Step 2:Write the algorithm
Step 3:Decide the programming language
Step 4:Write the program
Step 5:Test the program
*/

/*
Algorithm:
START
    Accept the number and display summation of even and odd elements
    Perform the Operation
    Display the result on console
STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  Maximum
//  Description:    It is use to display summation of even and odd elements
//  Input:          int
//  Output:         int
//  Author:         Kishor Suryabhan Handge
//  Date:           14/11/2025
///////////////////////////////////////////////////////////////////////////////////////////////// 
 
#include <stdio.h>
#include <stdlib.h>

int Difference(int Arr[], int iLength)
{
    int iCnt = 0, iEvenSum = 0,iOddSum = 0;

    for (iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] %2 == 0 )
        {
            iEvenSum = iEvenSum + Arr[iCnt];
        }  
        else
        {
            iOddSum = iOddSum + Arr[iCnt];
        }  
    }

    return (iEvenSum - iOddSum);

}

int main()
{
    int iSize = 0, iCnt = 0, iRet = 0;
    int *p = NULL;

    printf("Enter Number Of Elements:\n");
    scanf("%d", &iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if (p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter %d elements:\n", iSize);

    for (iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element : %d\n", iCnt + 1);
        scanf("%d", &p[iCnt]);
    }

    iRet = Difference(p, iSize);
    printf("Result is :%d\n",iRet);

    free(p);

    return 0;
}


 

 
 

 

 
 
