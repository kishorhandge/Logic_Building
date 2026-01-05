

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

    public void DisplayAlternate()
    {       
        node temp = null;

        temp = first; 
        int Count = 1;

        while(temp.next != null)
        {   
            if(Count % 2 == 1)
            {   
               System.out.print("| "+temp.data+" |->");
            }
            Count++;
            temp = temp.next;   
        } 
        System.out.println("null\n");
    }
}

class Assignment_50_4
{
    public static void main(String Arr[])
    {
        SinglyLL obj;

        obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(41);
        obj.InsertFirst(20);
        obj.InsertFirst(25);
        obj.InsertFirst(10);
        obj.InsertFirst(55);

        obj.Display();

        obj.DisplayAlternate();
        
        obj = null;

        System.gc();
    }
}