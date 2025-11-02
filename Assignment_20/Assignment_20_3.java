class Logic
{
    void  CheckPerfect(int n)
    {    
        int iCnt=0;
        int iSum=0;

        for(iCnt=1;iCnt<n;iCnt++)
        {
            if(n%iCnt==0)
            {
                iSum=iSum+iCnt;
            }
        }
        if(iSum==n)
        {
            System.out.println("Number is a perfect number");
        }
        else
        {
            System.out.println("Not a perfect number");
        }
    }
}
class Assignment_20_3
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.CheckPerfect(6);
    }
 
}

 

 
 
