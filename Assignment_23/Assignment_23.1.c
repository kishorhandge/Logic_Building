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
    Accept the number and check wheather present or not
    Perform the Operation
    Display the result on console
STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  Check
//  Description:    It is use to Check the number is present or not
//  Input:          int
//  Output:         int
//  Author:         Kishor Suryabhan Handge
//  Date:           14/11/2025
///////////////////////////////////////////////////////////////////////////////////////////////// 
 
#include<stdio.h>
#include<stdlib.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;
 
int Check(int Arr[],int iLength,int iNo)
{
    int iCnt = 0 ,iCount=0;

    for(iCnt = 0;iCnt < iLength;iCnt++)
    {   
        if(Arr[iCnt]  == iNo)
        {
            return TRUE;
        }   
    }
    return FALSE; 
}

int main()
{   
    int iSize = 0,iCnt = 0,iRet = 0,iValue=0;
    int *p = NULL;
    BOOL bRet = FALSE;
    

    printf("Enter Number Of Elements:\n");
    scanf("%d",&iSize);

    printf("Enter the Number:\n");
    scanf("%d",&iValue);

    p = (int *)malloc(iSize*sizeof(int));
    
    if(p == NULL  )  
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter %d elements:\n",iSize);

    for(iCnt = 0;iCnt < iSize;iCnt++)
    {   
        printf("Enter element : %d\n",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    bRet = Check(p,iSize,iValue);

    if( bRet == TRUE)
    {
        printf("Number is present");
    }
    else
    {
        printf("Number is not present");
    }

    free(p);

    return 0;
}

 

 
 

 

 
 
