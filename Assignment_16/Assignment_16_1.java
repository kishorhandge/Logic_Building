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
    Accept the number from user and sum of first N natural number
    Perform the Operation
    Display the result on console
STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  CalculateSum
//  Description:    It is use to display sum of natural number
//  Input:          int
//  Output:         int
//  Author:         Kishor Suryabhan Handge
//  Date:           29/10/2025
/////////////////////////////////////////////////////////////////////////////////////////////////
class Logic
{
    void  CalculateSum(int n)
    {
        int iSum=0;
        int iCnt=0;

        for(iCnt=1;iCnt<=n;iCnt++)
        {
            iSum=iSum+iCnt;
            
        }
        System.out.println(iSum);
    }
}
class Assignment_16_1
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.CalculateSum(10);
    }
 
}

 

 
 
