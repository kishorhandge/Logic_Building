
class Logic
{
    void  CheckPalindrome(int num)
    {
        int iDigit=0;
       int iTemp=num;
        int iNum=0;
         

        while(num!=0)
        {
            iDigit=num%10;

            iNum=(iNum*10)+iDigit;
            num=num/10;
           
        }
        if(iTemp==iNum)
        {
            System.out.println("it is a palindrome");
        }
        else
        {
            System.out.println("it is not palindrome");
        }
    }
}
class Assignment_17_2
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.CheckPalindrome(121);
    }
 
}

 

 
 
