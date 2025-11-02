class Logic
{
    void  DisplayGrade(int marks)
    {
        if(marks<=50)
        {
            System.out.println("C Grade");
        }
        else if(marks>50 && marks<=75)
        {
            System.out.println("B Grade");
        }
        else if(marks>75 && marks<=100)
        {
            System.out.println("A Grade");
        }
        else 
        {
            System.out.println("Invalid Input");
        }
    }
}
class Assignment_19_2
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.DisplayGrade(82);
    }
 
}

 

 
 
