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
    Accept the number from user and check wheather prime or not
    Perform the Operation
    Display the result on console
STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  CheckPrime
//  Description:    It is use to display the number prime or not
//  Input:          int
//  Output:         void
//  Author:         Kishor Suryabhan Handge
//  Date:           29/10/2025
/////////////////////////////////////////////////////////////////////////////////////////////////
class Logic
{
    void CheckPrime(int num)
    {
        int iCnt=0;

        for(iCnt=2;iCnt<num;iCnt++)
        {
            if(num%iCnt==0)
            {
                System.out.println("It is  not a prime number");
                return;
            }
        }

        System.out.println("It is a prime number");
    }
}
class Assignment_18_1
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj. CheckPrime(12);
    }
 
}

 

 
 
