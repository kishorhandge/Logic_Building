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

int CheckPrime(int iNo)
{   
    int iCount = 0;
    int iCnt = 1;

    for(iCnt = 2;iCnt<= (iNo/2);iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            iCount++;
        }
    }

    if(iCount == 0)
    {
        return 1;
    }
    else
    {
        return 0;
    }
   
}

void DisplayPrime(PNODE head)
{  

    while(head != NULL)
    {
        if(CheckPrime(head->data))
        {
            printf("%d ",head->data);

        }

        head = head->Next;
         
    }
    printf("\n");
  
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

    InsertFirst(&First,89);
    InsertFirst(&First,22);
    InsertFirst(&First,41);
    InsertFirst(&First,17);
    InsertFirst(&First,20);
    InsertFirst(&First,11);
    Display(First);
   

    printf("prime numbers are:\n");

    DisplayPrime(First);

    return 0;
}