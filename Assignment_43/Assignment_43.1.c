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

int CheckPerfect(int iNo)
{   
    int iSum = 0;
    int iCnt = 1;

    for(iCnt = 1;iCnt<= (iNo/2);iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            iSum = iSum + iCnt;
        }
    }

    if(iSum == iNo)
    {
        return 1;
    }
    else
    {
        return 0;
    }
   
}

void DisplayPerfect(PNODE head)
{  

    while(head != NULL)
    {
        if(CheckPerfect(head->data))
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
    InsertFirst(&First,6);
    InsertFirst(&First,41);
    InsertFirst(&First,17);
    InsertFirst(&First,28);
    InsertFirst(&First,11);
    Display(First);
   

    printf("perfect numbers are:\n");

    DisplayPerfect(First);

    return 0;
}