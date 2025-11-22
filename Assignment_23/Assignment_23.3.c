#include<stdio.h>
#include<stdlib.h>

int LastOcc(int Arr[],int iLength,int iNo)
{
    int iCnt = 0 ,iCount=0;

    for(iCnt = iLength;iCnt >=0;iCnt--)
    {   
        if(Arr[iCnt]  == iNo)
        {   
            iCount++;
             
        }  
        if(iCount == 1)
        {
            return iCnt;
        } 
    }
    return -1;
}

int main()
{   
    int iSize = 0,iCnt = 0,iRet = 0,iValue=0;
    int *p = NULL;
     
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

    iRet = LastOcc(p,iSize,iValue);

    if( iRet == -1)
    {
        printf("There is no such number");
    }
    else
    {
        printf("First occurance of a number is %d",iRet);
    }

    free(p);

    return 0;
}

 

 
 

 

 
 
