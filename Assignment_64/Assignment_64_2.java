// ------------------------------------------------------------
// Question 2:
// Accept one number from user.
// Check whether 5th and 18th bits are ON or OFF.
// If both bits are ON return TRUE.
// Otherwise return FALSE.
// ------------------------------------------------------------


import java.util.Scanner;

class Assignment_64_2
{
    public static void main(String A[])
    {   
        int iMask1 = 0,iNo = 0,iResult1 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        iNo = sobj.nextInt();

        iMask1 = 0x000020010;

        iResult1 = iNo & iMask1;
         
        if(iResult1 == iMask1)
        {
            System.out.println("5th and 18th bit is ON");
        }
        else
        {
            System.out.println("5th and 18th bit is OFF");
        }

    }
}