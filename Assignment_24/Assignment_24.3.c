#include<stdio.h>
#include<stdlib.h>

int Difference(int Arr[],int iLength)
{
    int iCnt = 0 ;
    int iMaxi = Arr[0];
    int iMini = Arr[0];

    for(iCnt = 0;iCnt < iLength;iCnt++)
    {   
        if(Arr[iCnt]  > iMaxi)
        {
            iMaxi = Arr[iCnt];
        } 
        if(Arr[iCnt]  < iMini)
        {
            iMini = Arr[iCnt];
        }     
    }
    return (iMaxi-iMini);
     
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

    iRet = Difference(p,iSize);

    printf("Difference is:%d\n",iRet);
    

    free(p);

    return 0;
}

 

 
 

 

 
 
