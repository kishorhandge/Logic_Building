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
    Accept the year from user check year is leap year or not
    Perform the Operation
    Display the result on console
STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  CheckLeapYear
//  Description:    It is use to display wheather year is leap year or not
//  Input:          int
//  Output:         void
//  Author:         Kishor Suryabhan Handge
//  Date:           30/10/2025
///////////////////////////////////////////////////////////////////////////////////////////////// 

class Logic
{
    void  CheckLeapYear(int year)
    {
        if(year%400==0 || (year%4==0 && year%100!=0))
        {
            System.out.println("Year is a Leap year");
        }
        else
        {
            System.out.println("Year is a not a leap year");
        }
    }
}
class Assignment_19_1
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.CheckLeapYear(2000);
    }
 
}

 

 
 
