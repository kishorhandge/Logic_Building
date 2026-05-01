// ============================================================
// 4. Traffic Rule Violation Fine Calculator
//
// A traffic police app calculates fine based on violations.
// If multiple violations occur, fines should be added.
//
// Fines:
//   - No helmet → ₹500
//   - No license → ₹1000
//   - Overspeeding → ₹1500
//
// Input:
//   - Helmet worn (Yes/No)
//   - License available (Yes/No)
//   - Overspeeding (Yes/No)
//
// Validations:
//   - Inputs must be Yes/No only
//
// Expected Output:
//   - Total Fine Amount: ₹<amount>
// ============================================================

import java.util.*;

class Assignment_75_4
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int Fine = 0;

        String helmetWorn = null;
        String LicenseAvailable = null;
        String Overspeeding = null;

        System.out.println("Helmet Wear (YES/NO)");
        helmetWorn = sobj.next();

        System.out.println("License available (Yes/No)");
        LicenseAvailable= sobj.next();

        System.out.println("Overspeeding (Yes/No)");
        Overspeeding = sobj.next();

        if((helmetWorn.equalsIgnoreCase("YES") == false) && 
        (helmetWorn.equalsIgnoreCase("NO") == false) )
        {
            System.out.println("Inputs must be Yes/No only");
            sobj.close();
            return;
        }

        if((LicenseAvailable.equalsIgnoreCase("YES") == false) && 
        (helmetWorn.equalsIgnoreCase("NO") == false) )
        {
            System.out.println("Inputs must be Yes/No only");
            sobj.close();
            return;
        }

        if((Overspeeding.equalsIgnoreCase("YES") == false) && 
        (helmetWorn.equalsIgnoreCase("NO") == false) )
        {
            System.out.println("Inputs must be Yes/No only");
            sobj.close();
            return;
        }

        if((helmetWorn.equalsIgnoreCase("NO")) )
        {
            Fine = Fine + 500;
        }

        if((LicenseAvailable.equalsIgnoreCase("NO")))
        {
            Fine = Fine + 1000;
        }

        if((Overspeeding.equalsIgnoreCase("NO")))
        {
            Fine = Fine + 1500;
        }

        System.out.println("Total Fine Amount:"+ Fine);

        sobj.close();
    }    
}