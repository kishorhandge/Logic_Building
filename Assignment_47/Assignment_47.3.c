#include <stdio.h>
#include <stdlib.h>


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

void SumDigit(PNODE first)
{   
    int iNo = 0;
    int iSum = 0;
    int iDigit = 0;

    while (first != NULL)
    {
        iNo = first->data;
        iSum = 0;

        if(iNo == 0)
        {
            iSum = 1;
        }
        else
        {
            while(iNo != 0)
            {
                iDigit= iNo % 10;
                iSum = iSum + iDigit;
                iNo = iNo /10;
            }
        }

        printf("%d -> %d\n", first->data, iSum);

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

    SumDigit(head);

    return 0;
}