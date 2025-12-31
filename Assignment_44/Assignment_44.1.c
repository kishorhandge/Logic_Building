#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node *PNODE;
typedef struct node **PPNODE;

void InsertFirst(PPNODE first,int no)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = no;
    newn->next = NULL;

    if((*first) == NULL)
    {
        (*first) = newn;
    }
    else
    {
        newn->next = (*first);
        (*first) = newn;
    }
}

void InsertLast(PPNODE first,int no)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = no;
    newn->next = NULL;

    if((*first) == NULL)
    {
        (*first) = newn;
    }
    else
    {
        temp = (*first);

        while(temp->next != NULL)
        {
            temp = temp->next;
        }

        temp->next = newn;
    }
}

void Display(PNODE first)
{
    while(first != NULL)
    {
        printf("| %d |->",first->data);
        first = first->next;
    }
    printf("NULL\n");
}

int Count(PNODE first)
{
    int iCount = 0;

    while(first != NULL)
    {
        iCount++;
        first = first->next;
    }

    return iCount;

}

bool CheckNumber(PNODE first,int No1)
{
    while(first != NULL)
    {
        if((first->data )== No1)
        {
            return true;
            
        }
        first = first->next;
        
    }

    return false;

}


int main()
{
    PNODE head = NULL;

    int bRet = false;

    InsertFirst(&head,51);
    InsertFirst(&head,41);
    InsertFirst(&head,31);
    InsertFirst(&head,21);
    InsertFirst(&head,11);

    Display(head);

    InsertLast(&head,101);
    InsertLast(&head,112);
    InsertLast(&head,113);

    Display(head);

    bRet = CheckNumber(head,31);
    
    if(bRet == true)
    {
        printf("Number is present\n");
    }
    else
    {
        printf("Number is not present\n");
    }

    return 0;
}