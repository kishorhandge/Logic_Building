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

    void DisplayAlternate()
    {
        PNODE temp = NULL;

        temp = first;

        int Count = 1;

        while (temp->next != NULL)
        {
            if (Count % 2 == 1)
            {
                cout << "| " << temp->data << " |->";
            }
            Count++;
            temp = temp->next;
        }
        cout << "NULL\n";
    }
};

int main()
{
    SinglyLL obj;
    bool bRet = false;

    obj.InsertFirst(51);
    obj.InsertFirst(40);
    obj.InsertFirst(31);
    obj.InsertFirst(20);
    obj.InsertFirst(-11);
    obj.InsertFirst(10);

    obj.Display();

    obj.DisplayAlternate();

    return 0;
}
