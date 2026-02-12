// ------------------------------------------------------------
// Question 5:
// Accept one number from user.
// Check whether first bit and last bit are ON or OFF.
// First bit means bit number 1.
// Last bit means bit number 32.
// If both bits are ON return TRUE.
// Otherwise return FALSE.
// ------------------------------------------------------------

import java.util.Scanner;

class Assignment_64_5
{
    public static void main(String A[])
    {   
        int iMask = 0,iNo = 0,iResult1 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        iNo = sobj.nextInt();

        iMask = 0x80000001;

        iResult1 = iNo & iMask;
         
        if(iResult1 == iMask)
        {
            System.out.println("1st and last bit is ON");
        }
        else
        {
            System.out.println("1st and last bit is OFF");
        }

    }
}