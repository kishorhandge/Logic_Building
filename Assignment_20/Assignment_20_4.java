class Logic
{
    void  FindLargestDigit(int num)
    {    
        int iDigit=0;
        int iLargest=0;
        
        while(num!=0)
        {
            iDigit=num%10;
            if(iDigit>iLargest)
            {
                iLargest=iDigit;
            }
            num=num/10;
        }

        System.out.println(iLargest);
    
    }
}
class Assignment_20_4
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.FindLargestDigit(83429);
    }
 
}

 

 
 
