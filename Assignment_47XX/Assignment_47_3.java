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

     
    public void SumDigit()
    {
        node temp = null;

        temp = first;
        int iNo = 0;
        int iDigit = 0;
        int iSum = 0;

        while(temp != null)
        {   
            iNo = temp.data;
            iSum = 0;

                while(iNo != 0)
                {   
                    iDigit = iNo % 10;
                    iSum = iSum + iDigit;

                    iNo = iNo/10;
                     
                }

            System.out.println("Sum of Digit of " + temp.data + " is " + iSum);
            temp = temp.next;
        }
           
    }
}

class Assignment_47_3
{
    public static void main(String Arr[])
    {
        SinglyLL obj;

        obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(41);
        obj.InsertFirst(31);
        obj.InsertFirst(10);
        obj.InsertFirst(10);
        obj.InsertFirst(24);

        obj.Display();

        obj.SumDigit();

        obj = null;

        System.gc();
    }
}