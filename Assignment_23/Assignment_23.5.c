#include<stdio.h>
#include<stdlib.h>

int Product(int Arr[],int iLength)
{
    int iCnt = 0 ,iMulOdd=1;

    for(iCnt = 0;iCnt < iLength;iCnt++)
    {   
        if(Arr[iCnt] %2 ==1 )
        {   
            
            iMulOdd = iMulOdd * Arr[iCnt];
        }   
    }

    return iMulOdd;
   
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

    iRet = Product(p,iSize);

    printf("Product of odd elements is:%d\n",iRet);


    free(p);

    return 0;
}

 

 
 

 

 
 
