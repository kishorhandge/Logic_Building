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
    Accept the number from user and display sum of even number
    Perform the Operation
    Display the result on console
STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  SumEvenNumber
//  Description:    It is use to display wheather year is leap year or not
//  Input:          int
//  Output:         void
//  Author:         Kishor Suryabhan Handge
//  Date:           30/10/2025
///////////////////////////////////////////////////////////////////////////////////////////////// 

class Logic
{
    void  SumEvenNumber(int n)
    {   
        int iSum=0;
        int iCnt=0;

        for(iCnt=1;iCnt<=n;iCnt++)
        {
            if(iCnt%2==0)
            {
                iSum=iSum+iCnt;
            }
        }

        System.out.println(iSum);

        
    }
}
class Assignment_20_1
{
    public static void main(String Arr[])
    {
        Logic obj=new Logic();
        obj.SumEvenNumber(10);
    }
 
}

 

 
 
