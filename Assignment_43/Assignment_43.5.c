#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

struct node
{
    int data;
    struct node *Next;
};

typedef struct node NODE;
typedef struct node *PNODE;
typedef struct node **PPNODE;

void InsertFirst(PPNODE first,int no)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = no;
    newn->Next = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else
    {
        newn->Next = (*first);
        *first = newn;
    }

}

int CheckDigit(int iNo)
{   
    int iSum = 0;
     
    while(iNo != 0)
    {
        iSum =  iSum + (iNo %10);
        iNo = iNo/10;

    }
    return iSum;
   
}

int SumDigit(PNODE head)
{  
    int iSum = 0;
    int iRet = 0;

    while(head != NULL)
    {
         
        iRet = iSum + CheckDigit(head->data);
        printf("%d ",iRet);

        head = head->Next;
         
    }
    return iSum;
  
}

void Display(PNODE head)
{
    while(head != NULL)
    {
        printf("| %d |->",head->data);
        head = head->Next;
    }
    printf("NULL\n");

}
int main()
{
    PNODE First = NULL;

    int iRet = 0;


    InsertFirst(&First,640);
    InsertFirst(&First,240);
    InsertFirst(&First,20);
    InsertFirst(&First,230);
    InsertFirst(&First,110);
    Display(First);
   

    SumDigit(First);

    return 0;
}