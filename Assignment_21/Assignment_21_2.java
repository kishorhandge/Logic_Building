class Logic
{
    void  CountEvenOddDigits(int n)
    {    
        int iCnt=0;
        int iEvenCount=0;
        int iOddCount=0;

        for(iCnt=1;iCnt<=n;iCnt++)
        {
            if(iCnt%2==0)
            {
                iEvenCount++;
            }
            else
            {
                iOddCount++;
            }
        }

        System.out.println("Even Count is:"+iEvenCount);

        System.out.println("Odd Count is:"+iOddCount);
         
        
    }
}
class Assignment_21_2
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.CountEvenOddDigits(50);
    }
 
}

 

 
 
