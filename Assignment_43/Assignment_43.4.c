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

int SecMaximum(PNODE head)
{   
    int iMaxi = 0;
    int SecMaxi = iMaxi;

    while(head != NULL)
    {
        if((head)->data > iMaxi)
        {
            SecMaxi = iMaxi;
            iMaxi = head->data;
        }

        else if(SecMaxi < head->data && head->data != iMaxi)
        {
            SecMaxi = head->data;
        }
        
        head = head->Next;
    }

    
    return SecMaxi;

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

    InsertFirst(&First,41);
    InsertFirst(&First,32);
    InsertFirst(&First,20);
    InsertFirst(&First,11);
    
    Display(First);
   

   iRet = SecMaximum(First);

    printf(" Second Maximum number is:%d\n",iRet);

    return 0;
}