

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

    
    public int Difference()
    {
        node temp = first;

        int iMax = temp.data;
        int iMini = temp.data;


        while(temp != null)
        {   
            if((temp.data) > iMax)
            {
                iMax = temp.data;
            }

            if((temp.data) < iMini)
            {
                iMini = temp.data;
            }
            temp = temp.next;
             
        }
       return (iMax - iMini);
    }
}

class Assignment_49_1
{
    public static void main(String Arr[])
    {
        SinglyLL obj;
        int iRet = 0;

        obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(41);
        obj.InsertFirst(28);
        obj.InsertFirst(6);
        obj.InsertFirst(10);
        obj.InsertFirst(2);

        obj.Display();

        iRet = obj.Difference();

        System.out.println("The Difference is: "+iRet);

        obj = null;

        System.gc();
    }
}