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

void  DisplayGreaterThanAvg(PNODE first)
{
    int iCount = 0;
    int iSum = 0;
    float fAvg = 0.0f;

    PNODE temp = NULL;

    temp = first;

    while (temp != NULL)
    {
        iSum = iSum + temp->data;
        iCount++;
        temp = temp->next; 
    }
  
    if(iCount == 0 )
    {
        return;
    }

    fAvg = (float)(iSum)/iCount;

    while (first != NULL)
    {
        if((first->data) > fAvg)
        {
            printf("| %d |->", first->data);
        }
        first = first->next;
    }
    printf("NULL\n");
}

int main()
{
    PNODE head = NULL;

    InsertFirst(&head, 11);
    InsertFirst(&head, -41);
    InsertFirst(&head, 22);
    InsertFirst(&head, -21);
    InsertFirst(&head, 11);

    Display(head);

    InsertLast(&head, 101);

    Display(head);

    DisplayGreaterThanAvg(head);

    return 0;
}