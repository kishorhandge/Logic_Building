class Logic
{
    void  FindFactorial(int num)
    {
        int iDigit = 0;

    if (num < 0)
    {
       num=-num;
    }

    while (num != 0)
    {
        iDigit = num % 10;
        System.out.println(iDigit);
        num= num / 10;
    }

    }
}
class Assignment_16_4
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.FindFactorial(1234);
    }
 
}
