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


void DisplayDivByThree(PNODE first)
{   

    while (first != NULL)
    {
       if((first->data) % 3 == 0)
       {
            printf("| %d |->", first->data);
       }
       first = first->next;
       
    }
   
}

int main()
{
    PNODE head = NULL;

    InsertFirst(&head, 51);
    InsertFirst(&head, 42);
    InsertFirst(&head, 22);
    InsertFirst(&head, 21);
    InsertFirst(&head, 8);

    Display(head);

    InsertLast(&head, 112);
    InsertLast(&head, 123);
    InsertLast(&head, 113);

    Display(head);

    DisplayDivByThree(head);

    return 0;
}