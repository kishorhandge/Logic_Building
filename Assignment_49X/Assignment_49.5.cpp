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

    int DisplayDivByFive()
    {
        PNODE temp = NULL;

        temp = first;

        int iNo = 0;
        int Count = 0;
        int iTwoCnt = 0;
        int iDigit = 0;

        while (temp != NULL)
        {
            Count = 0;
            iNo = temp->data;

            while (iNo != 0)
            {
                iDigit = iNo % 10;
                Count++;
                iNo = iNo / 10;
            }
            if (Count == 2)
            {
                iTwoCnt++;
            }

            temp = temp->next;
        }

        return iTwoCnt;
    }
};

int main()
{
    SinglyLL obj;
    int iRet = 0;

    obj.InsertFirst(51);
    obj.InsertFirst(40);
    obj.InsertFirst(31);
    obj.InsertFirst(20);
    obj.InsertFirst(11);
    obj.InsertFirst(31);

    obj.Display();

    iRet = obj.DisplayDivByFive();

    cout << "Count Of Two Digit Number is: " << iRet << "\n";

    return 0;
}
