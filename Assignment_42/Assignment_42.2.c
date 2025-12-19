#include<stdio.h>
#include<stdlib.h>

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
int SearchLastOcc(PNODE head,int no)
{   
    int temp = 1;
    int iLast = 0;

    while(head != NULL)
    {
        if(head->data == no)
        {
            iLast = temp;
        }

        head = head->Next;
        temp++;
         
    }

    return iLast;
     
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


    InsertFirst(&First,70);
    InsertFirst(&First,30);
    InsertFirst(&First,50);
    InsertFirst(&First,40);
    InsertFirst(&First,30);
    InsertFirst(&First,20);
    InsertFirst(&First,10);

    Display(First);

    iRet = SearchLastOcc(First,30);

    printf("Last Occurance of Node is found at position %d\n",iRet);

     
    return 0;
}