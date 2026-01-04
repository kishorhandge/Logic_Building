class node
{
    public int data;
    public node next;
    
    public node(int no)
    {
        data = no;
        next = null;
    }
}

class SinglyLL
{
    private node first;
    private int iCount;

    public SinglyLL() 
    {
        System.out.println("Object Of SinglyLL gets created");
        first = null;
        iCount = 0;
    }

    public void InsertFirst(int no)
    {
        node newn  = null;

        newn = new node(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }
    }
    public void Display()
    {
        node temp = null;

        temp = first;

        while(temp != null)
        {
            System.out.print("| "+temp.data+" |->");
            temp = temp.next;
        }

        System.out.println("null\n");
    }

    public void DisplayEven()
    {
        node temp = null;

        temp = first;

        while(temp != null)
        {
            if((temp.data) % 2 == 0 )
            {
               System.out.print("| "+temp.data+" |->");
               
            }
            temp = temp.next;
        }
        System.out.println("null\n");

    }

    
}

class Assignment_44_5
{
    public static void main(String Arr[])
    {
        SinglyLL obj;

        int iRet = 0;

        obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(41);
        obj.InsertFirst(31);
        obj.InsertFirst(20);
        obj.InsertFirst(10);
        obj.InsertFirst(24);
        obj.InsertFirst(8);
        obj.InsertFirst(4);

        obj.Display();

        obj.DisplayEven();
        
        obj = null;

        System.gc();
    }
}