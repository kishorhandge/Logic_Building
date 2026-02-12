// ------------------------------------------------------------
// Question 1:
// Accept one number from user.
// Check whether 15th bit is ON or OFF.
// If bit is ON return TRUE.
// If bit is OFF return FALSE.
// ------------------------------------------------------------


import java.util.Scanner;

class Assignment_64_1
{
    public static void main(String A[])
    {   
        int iMask = 0,iNo = 0,iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        iNo = sobj.nextInt();

        iMask = 0x00004000;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("15th bit is ON");
        }
        else
        {
            System.out.println("15th bit is OFF");
        }

    }
}