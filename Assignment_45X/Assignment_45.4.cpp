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

    int CountGreater(int iNo)
    {
        PNODE temp = NULL;
        int Count = 0;
         
        temp = first;

        while(temp != NULL)
        {
            if((temp->data) > iNo)
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
    obj.InsertFirst(40);
    obj.InsertFirst(31);
    obj.InsertFirst(20);
    obj.InsertFirst(11);
    obj.InsertFirst(31);

    obj.Display();

    iRet = obj. CountGreater(31);
     
    cout<<"Count of Greater Given Number is : "<<iRet;

    return 0;
}
