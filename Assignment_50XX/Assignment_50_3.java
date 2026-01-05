

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

    public boolean CheckSorted()
    {       
        node temp = null;

        temp = first; 

        if (temp == null || temp.next == null)
        {
            return true;
        }

        while(temp.next != null)
        {   
            if(temp.data > temp.next.data)
            {   
                return false;
               
            }

            temp = temp.next;   
        } 
        
        return true;
    }
}

class Assignment_50_3
{
    public static void main(String Arr[])
    {
        SinglyLL obj;
        boolean bRet = false;

        obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(41);
        obj.InsertFirst(20);
        obj.InsertFirst(25);
        obj.InsertFirst(10);
        obj.InsertFirst(55);

        obj.Display();

        bRet = obj.CheckSorted();

        if(bRet == true)
        {
            System.out.println("Linked List Is Sorted:");
        }
        else
        {
            System.out.println("Linked List Is Not Sorted:");
        }
        
        obj = null;

        System.gc();
    }
}