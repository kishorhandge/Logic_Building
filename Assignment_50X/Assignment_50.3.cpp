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

    bool CheckSorted()
    {
        if (first == NULL || first->next == NULL)
        {
            return true;
        }

        PNODE temp = NULL;

        temp = first;

        while (temp->next != NULL)
        {
            if ((temp->data) > (temp->next->data))
            {
                return false;
            }

            temp = temp->next;
        }

        return true;
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

    bRet = obj.CheckSorted();

    if (bRet == true)
    {
        cout << "All Elements are Sorted:" << "\n";
    }
    else
    {
        cout << "All Elements are Not Sorted:" << "\n";
    }

    return 0;
}
