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
    Accept the number and count its Even Frequency
    Perform the Operation
    Display the result on console
STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  CountEven
//  Description:    It is use to count even number
//  Input:          int
//  Output:         int
//  Author:         Kishor Suryabhan Handge
//  Date:           14/11/2025
///////////////////////////////////////////////////////////////////////////////////////////////// 
 
#include<stdio.h>
#include<stdlib.h>

int CountEven (int Arr[],int iLength)
{
    int iCnt = 0,iCount=0;
    for(iCnt = 0;iCnt < iLength;iCnt++)
    {   
        if(Arr[iCnt] % 2 == 0)
        {
            iCount++;;
         
        }
        
    }
    return iCount;

}

int main()
{   
    int iLength = 0,iCnt = 0,iRet = 0;
    int *p = NULL;

    printf("Enter Number Of Elements:\n");
    scanf("%d",&iLength);

    p = (int *)malloc(iLength*sizeof(int));
    
    if(p == NULL  )  
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter %d elements:\n",iLength);

    for(iCnt = 0;iCnt < iLength;iCnt++)
    {   
        printf("Enter element : %d\n",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    iRet = CountEven(p,iLength);

    printf("count of even are :%d\n",iRet);

    free(p);

    return 0;
}
/////////////////////////////////////
//
//  Test Case: Input: 2,4,5,6,8  Output:4
//
/////////////////////////////////////

 

 
 
