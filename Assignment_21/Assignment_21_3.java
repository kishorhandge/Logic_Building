class Logic
{
    void  DisplayFactors(int n)
    {    
        int iCnt=0;
         
        for(iCnt=1;iCnt<n;iCnt++)
        {
            if(n%iCnt==0)
            {
                System.out.print(iCnt+"\t");
            }
            
        }
   
    }
}
class Assignment_21_3
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.DisplayFactors(12);
    }
 
}

 

 
 
