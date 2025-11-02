  
class Logic
{
    void  PrintTable(int num)
    {
        int iCnt=0;

        for(iCnt=1;iCnt<=10;iCnt++)
        {
            System.out.println(iCnt*num);
        }
    }
}
class Assignment_17_5
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.PrintTable(5);
    }
 
}

 

 
 
