

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

    public int CountTwoDigit()
    {
        node temp = null;

        temp = first;
        int iNo = 0;
        int Count = 0;
        int iDigit = 0;
        int iTwoCnt = 0;

        while(temp != null)
        {   
            iNo = temp.data;
            Count = 0;

            while(iNo != 0)
            {
                iDigit = iNo % 10;
                Count++;
                iNo = iNo /10;

            }

            if(Count == 2)
            {
                iTwoCnt++;
            }
            temp = temp.next;
             
        }
       return iTwoCnt++;
    }
}

class Assignment_49_5
{
    public static void main(String Arr[])
    {
        SinglyLL obj;
        int iRet = 0;

        obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(41);
        obj.InsertFirst(20);
        obj.InsertFirst(25);
        obj.InsertFirst(10);
        obj.InsertFirst(55);

        obj.Display();

        iRet = obj.CountTwoDigit();

        System.out.println("Count Of Two Digit Number is: "+iRet);
        
        obj = null;

        System.gc();
    }
}