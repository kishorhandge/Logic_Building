class Logic
{
    void  CountFactors(int n)
    {    
        int iCnt=0;
        int iFactorCount=0;
         
        for(iCnt=1;iCnt<n;iCnt++)
        {
            if(n%iCnt==0)
            {
                iFactorCount++;
            }
            
        }

        System.out.println("Factors count is:"+iFactorCount);
   
    }
}
class Assignment_21_4
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.CountFactors(12);
    }
 
}

 

 
 
