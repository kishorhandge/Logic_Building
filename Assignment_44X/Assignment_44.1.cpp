#include<iostream>
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
    private:
        PNODE first;
        int iCount;

    public:

        SinglyLL()
        {
            cout<<"Object of SinglyLL gets created"<<"\n";
            first = NULL;
            iCount = 0;
        }

    void InsertFirst(int no)
    {
        PNODE newn = NULL;

        newn = new NODE;

        newn->data = no;
        newn->next = NULL;

        if(first == NULL)
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

        while(temp != NULL)
        {
            cout<<"| "<<temp->data<<" |->";
            temp = temp->next;
        }

        cout<<"NULL\n";
    }

    bool Search(int iNo)
    {
        PNODE temp = NULL;

        temp = first;

        while(temp != NULL)
        {
            if(temp->data == iNo)
            {
                return true;
                temp = temp->next;
            }
            temp = temp->next;
            
        }
        return false;
    }
    
};

int main()
{
    SinglyLL obj;
    bool bRet = false;

    obj.InsertFirst(51);
    obj.InsertFirst(41);
    obj.InsertFirst(31);
    obj.InsertFirst(21);
    obj.InsertFirst(11);

    obj.Display();

    bRet = obj.Search(41);

    if(bRet == true)
    {
        cout<<"Elements is Present\n";
    }
    else
    {
        cout<<"Elements is Not Present\n";
    }

    return 0;
}
