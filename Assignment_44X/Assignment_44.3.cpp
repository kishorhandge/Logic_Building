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

    int CountOdd()
    {
        PNODE temp = NULL;
        int Count = 0;

        temp = first;

        while(temp != NULL)
        {
            if((temp->data) % 2 == 1)
            {
                Count++;
            }
            temp = temp->next;
            
        }
        return Count;
    }
    
};

int main()
{
    SinglyLL obj;
    int iRet = 0;

    obj.InsertFirst(51);
    obj.InsertFirst(41);
    obj.InsertFirst(31);
    obj.InsertFirst(21);
    obj.InsertFirst(11);

    obj.Display();

    iRet = obj.CountOdd();

    cout<<"Count Of Odd is: "<<iRet<<"\n";
     
    return 0;
}
