#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[],int iLength)
{
    int iCnt = 0,iEvenCount=0,iOddCount=0;

    for(iCnt = 0;iCnt < iLength;iCnt++)
    {   
        if(Arr[iCnt] % 2 == 0)
        {
            iEvenCount++;;
         
        }
        else
        {
            iOddCount++;
        }
        
    }
    return (iEvenCount - iOddCount);

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

    iRet = Frequency(p,iLength);

    printf("Result is:%d\n",iRet);

    free(p);

    return 0;
}

 

 
 
