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
    Accept the number and display product of a digit
    Perform the Operation
    Display the result on console
STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  ProductOfDigit
//  Description:    It is use to display product of a digit
//  Input:          int
//  Output:         void
//  Author:         Kishor Suryabhan Handge
//  Date:           30/10/2025
///////////////////////////////////////////////////////////////////////////////////////////////// 

class Logic
{
    void  ProductOfDigit(int num)
    {   
        int iDigit=0;
        int iMul=1;
        
        while(num!=0)
        {
            iDigit=num%10;
            iMul=iMul*iDigit;
            num=num/10;
        }

        System.out.println(iMul);
        
    }
}
class Assignment_21_1
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.ProductOfDigit(234);
    }
 
}

 

 
 
