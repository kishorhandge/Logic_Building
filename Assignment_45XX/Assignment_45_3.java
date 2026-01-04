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

    public int LastOcc(int iNo)
    {
        node temp = null;

        temp = first;
        int lastpos = 0;
        
        int iPos = 1;

        while(temp != null)
        {
            if((temp.data) == iNo)
            {
               lastpos = iPos;
                 
            }
            iPos++;
            temp = temp.next;
        }
    
        return lastpos;
    }

    
}

class Assignment_45_3
{
    public static void main(String Arr[])
    {
        SinglyLL obj;

        int iRet = 0;

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

        iRet = obj.LastOcc(10);

        System.out.println("First Occurance Position is :"+iRet);

        obj = null;

        System.gc();
    }
}