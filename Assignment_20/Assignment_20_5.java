class Logic
{
    void  FindSmallesttDigit(int num)
    {    
        int iDigit=0;
        int iSmallest=num;
        
        while(num!=0)
        {
            iDigit=num%10;
            if(iDigit<iSmallest)
            {
                iSmallest=iDigit;
            }
            num=num/10;
        }

        System.out.println(iSmallest);
    
    }
}
class Assignment_20_5
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.FindSmallesttDigit(83429);
    }
 
}

 

 
 
