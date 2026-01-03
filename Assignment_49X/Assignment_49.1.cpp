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

    int Difference()
    {   
        PNODE temp = NULL;

        temp = first;
        int iMax = temp->data;
        int iMin = temp->data;

        while(temp != NULL)
        {
            if((temp->data) > iMax)
            {
                iMax = temp->data; 
            }

            if((temp->data) < iMin)
            {
                iMin = temp->data; 
            }
            temp = temp->next;
        }
        
        return (iMax - iMin);
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

    iRet = obj.Difference();

    cout<<"Difference is:"<<iRet<<"\n";

    return 0;
}
