#include <iostream>
using namespace std;

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node *PNODE;

class SinglyLL
{
public:
    PNODE first;
    int iCount;

public:
    SinglyLL()
    {
        cout << "Object of SinglyLL gets created" << "\n";
        first = NULL;
        iCount = 0;
    }

    void InsertFirst(int no)
    {
        PNODE newn = NULL;

        newn = new NODE;

        newn->data = no;
        newn->next = NULL;

        if (first == NULL)
        {
            first = newn;
        }
        else
        {
            newn->next = first;
            first = newn;
        }
    }

    void Display()
    {
        PNODE temp = NULL;

        temp = first;

        while (temp != NULL)
        {
            cout << "| " << temp->data << " |->";
            temp = temp->next;
        }

        cout << "NULL\n";
    }

    void CountDigit(PNODE temp)
    {
        int Count = 0;

        int iNo = 0;

        while (temp != NULL)
        {
            Count = 0;

            iNo = temp->data;

            if (iNo == 0)
            {
                Count = 1;
            }

            else
            {
                while (iNo != 0)
                {
                    iNo = iNo / 10;
                    Count++;
                }
            }
            printf("%d -> %d\n", temp->data, Count);

            temp = temp->next;
        }
    }
};

int main()
{
    SinglyLL obj;

    obj.InsertFirst(51);
    obj.InsertFirst(40);
    obj.InsertFirst(31);
    obj.InsertFirst(20);
    obj.InsertFirst(11);
    obj.InsertFirst(31);

    obj.Display();

    obj.CountDigit(obj.first);

    return 0;
}
