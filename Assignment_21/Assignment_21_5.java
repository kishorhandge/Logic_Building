class Logic
{
    void  PrintDivisibleBy2and3(int n)
    {    
        int iCnt=0;
          
        for(iCnt=1;iCnt<=n;iCnt++)
        {
            if(iCnt%2==0 && iCnt%3==0)
            {
                System.out.println(iCnt);
            }  
        }
         
    }
}
class Assignment_21_5
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.PrintDivisibleBy2and3(30);
    }
 
}

 

 
 
