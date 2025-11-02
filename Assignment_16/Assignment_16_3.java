class Logic
{
    void  FindFactorial(int num)
    {
        int iCnt=0;
        int iFact=1;

        for(iCnt=1;iCnt<=num;iCnt++)
        {
            iFact=iFact*iCnt;
        }
        System.out.println("Factorial of given number is :"+iFact);

    }
}
class Assignment_16_3
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.FindFactorial(5);
    }
 
}
