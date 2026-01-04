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

    public boolean Search(int iNo)
    {
        node temp = null;

        temp = first;

        while(temp != null)
        {
            if(temp.data == iNo)
            {
                return true;
            }
            temp = temp.next;
        }

        return false;

    }

    
}

class Assignment_44_1
{
    public static void main(String Arr[])
    {
        SinglyLL obj;

        boolean bRet = false;

        obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(41);
        obj.InsertFirst(31);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();

        bRet = obj.Search(31);

        if(bRet == true)
        {
            System.out.println("Element is Found");
        }
        else
        {
            System.out.println("Element is Not found");
        }
        
        obj = null;

        System.gc();
    }
}