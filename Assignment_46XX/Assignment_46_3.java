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

    public boolean  IsEmpty()
    {
        node temp = null;

        temp = first;

            if(temp == null )
            {
                
                return false;
            }
            else
            {
                return true;
            }
        
    }

    
}

class Assignment_46_3
{
    public static void main(String Arr[])
    {
        SinglyLL obj;

        boolean bRet = false;

        obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(41);
        obj.InsertFirst(31);
        obj.InsertFirst(10);
        obj.InsertFirst(10);
        obj.InsertFirst(24);
        obj.InsertFirst(10);
        obj.InsertFirst(4);

        obj.Display();

        bRet = obj.IsEmpty();

        if(bRet == true)
        {
            System.out.println("Linked List is Not Empty");
        }
        else
        {
            System.out.println("Linked List Empty");
        }

        obj = null;

        System.gc();
    }
}