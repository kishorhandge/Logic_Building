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
    Accept the number and display maximum number among them
    Perform the Operation
    Display the result on console
STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  Maximum
//  Description:    It is use to display maximum number
//  Input:          int
//  Output:         int
//  Author:         Kishor Suryabhan Handge
//  Date:           14/11/2025
///////////////////////////////////////////////////////////////////////////////////////////////// 
 
#include<stdio.h>
#include<stdlib.h>

int Maximum(int Arr[],int iLength)
{
    int iCnt = 0 ;
    int iMaxi = Arr[0];

    for(iCnt = 0;iCnt < iLength;iCnt++)
    {   
        if(Arr[iCnt]  > iMaxi)
        {
            iMaxi = Arr[iCnt];
        }   
    }
    return iMaxi;
     
}

int main()
{   
    int iSize = 0,iCnt = 0,iRet = 0;
    int *p = NULL;
    
    printf("Enter Number Of Elements:\n");
    scanf("%d",&iSize);

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

    iRet = Maximum(p,iSize);

    printf("Maximum number is:%d\n",iRet);
    

    free(p);

    return 0;
}

 

 
 

 

 
 
