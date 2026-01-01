#include <stdio.h>
#include <stdlib.h>
#include<stdbool.h>


struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node *PNODE;
typedef struct node **PPNODE;

void InsertFirst(PPNODE first, int no)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = no;
    newn->next = NULL;

    if ((*first) == NULL)
    {
        (*first) = newn;
    }
    else
    {
        newn->next = (*first);
        (*first) = newn;
    }
}

void InsertLast(PPNODE first, int no)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = no;
    newn->next = NULL;

    if ((*first) == NULL)
    {
        (*first) = newn;
    }
    else
    {
        temp = (*first);

        while (temp->next != NULL)
        {
            temp = temp->next;
        }

        temp->next = newn;
    }
}

void Display(PNODE first)
{
    while (first != NULL)
    {
        printf("| %d |->", first->data);
        first = first->next;
    }
    printf("NULL\n");
}
bool IsPrime(int iNo)
{
    int iCnt = 0;

    for(iCnt = 2;iCnt<(iNo/2);iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            return false;
        }
    }

    return true;
}
void DisplayPrime(PNODE first)
{   
    int iCnt = 0;

    while(first != NULL)
    {
        if(IsPrime(first->data))
        {
            printf("%d is a prime\n",first->data);
        }
        first = first->next;
    }
    
}

int main()
{
    PNODE head = NULL;
    int iRet = 0;

    InsertFirst(&head, 51);
    InsertFirst(&head, 41);
    InsertFirst(&head, 22);

    Display(head);

    InsertLast(&head, 101);

    Display(head);

   DisplayPrime(head);

    return 0;
}