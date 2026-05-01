
import java.util.Scanner;

// ============================================================
// 1. Shopping Mall Parking Fee Calculator
//
// A parking gate records total parking duration in hours.
// Charges are calculated based on total hours stayed.
//
// Rules:
//   - First 2 hours → ₹20 (flat)
//   - After 2 hours → ₹10 per extra hour
//   - If total hours > 10 → Add ₹50 penalty
//
// Input:
//   - Total parking hours (integer)
//
// Validations:
//   - Hours cannot be negative
//
// Expected Output:
//   - Total Parking Duration: <hours> hours
//   - Total Parking Fee: ₹<amount>
// ============================================================

class Assignment_75_1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int fees = 0;

        System.out.println("Enter the Hours:");
        int Hour = sobj.nextInt();

        if(Hour <= 0)
        {
            System.out.println("Hours cannot be negative and zero");
            sobj.close();
            
            return;
        }

        if(Hour <= 2)
        {
            fees = fees + 20;
        }
        
        else if(Hour > 2 && Hour < 10)
        {
            fees = 20 + ((Hour - 2)* 10);
        }

        else if(Hour > 10)
        {
            fees = 20 + 80 + ((Hour - 10) * 50);
        }

        System.out.println(" Total Parking Duration : "+Hour);
        System.out.println("Total Parking Fee : "+fees);

        sobj.close();
    }
}