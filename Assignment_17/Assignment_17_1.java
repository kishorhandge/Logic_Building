/*
Step 1:Understand the problem statement
Step 2:Write the algorithm
Step 3:Decide the programming language
Step 4:Write the program
Step 5:Test the program
*/

/*
Algorithm:
START
    Accept the number from user and sum of digit of a number
    Perform the Operation
    Display the result on console
STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  SumOfDigit
//  Description:    It is use to display sum of digits of a number
//  Input:          int
//  Output:         void
//  Author:         Kishor Suryabhan Handge
//  Date:           29/10/2025
/////////////////////////////////////////////////////////////////////////////////////////////////
class Logic
{
    void  SumOfDigits(int num)
    {
        int iDigit=0;
        int iSum=0;
         

        while(num!=0)
        {
            iDigit=num%10;
            iSum=iSum+iDigit;
            num=num/10;
           
        }
        System.out.println("Summation of all digits is:"+iSum);
    }
}
class Assignment_17_1
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj. SumOfDigits(1234);
    }
 
}

 

 
 
