 
class Logic
{
    void  FindMin(int a,int b,int c)
    {
        if(a<b && a<c)
        {
            System.out.println("First number is smaller");
        }
        else if(b<a && b<c)
        {
            System.out.println("Second number is smaller");
        }
        else if(c<a && c<b)
        {
            System.out.println("Third number is smaller");
        }
    }
}
class Assignment_17_4
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.FindMin(3,7,2);
    }
 
}

 

 
 
