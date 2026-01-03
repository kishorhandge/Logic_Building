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

    void SumDigit(PNODE temp)
    {
        int Count = 0;
        int iDigit = 0;

        int iSum = 0;

        int iNo = 0;

        while (temp != NULL)
        {
            iSum = 0;

            iNo = temp->data;

                while (iNo != 0)
                {   
                    iDigit = iNo % 10;
                    iSum = iSum + iDigit;

                    iNo = iNo / 10;
                     
                }
             
            printf("%d -> %d\n", temp->data, iSum);
            temp = temp->next;
        }
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

    obj.SumDigit(obj.first);

    return 0;
}
