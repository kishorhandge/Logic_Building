

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


    
    public void MultiplyByTwo()
    {
        node temp = null;

        temp = first;

        while(temp != null)
        {   
            System.out.print("| "+(temp.data *2)+" |->");
            temp = temp.next;
             
        }
        System.out.println("null\n"); 
    }
}

class Assignment_48_3
{
    public static void main(String Arr[])
    {
        SinglyLL obj;

        obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(41);
        obj.InsertFirst(28);
        obj.InsertFirst(6);
        obj.InsertFirst(10);
        obj.InsertFirst(2);

        obj.Display();

        obj.MultiplyByTwo();

        obj = null;

        System.gc();
    }
}