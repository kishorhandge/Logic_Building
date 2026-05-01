// ============================================================
// 3. Courier Charge Calculator
//
// A courier service calculates delivery charge based on weight.
//
// Charges:
//   - Up to 1 kg → ₹50
//   - 1–5 kg → ₹50 + ₹20 per kg above 1 kg
//   - Above 5 kg → ₹150 + ₹30 per kg above 5 kg
//
// Input:
//   - Parcel weight in kg (integer)
//
// Validations:
//   - Weight must be greater than 0
//
// Expected Output:
//   - Parcel Weight: <weight> kg
//   - Courier Charge: ₹<amount>
// ============================================================

import java.util.*;

class Assignment_76_3
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int Marks = 0;
        int AttendancePercentage = 0;
        int FamilyIncome = 0;

        System.out.println("Enter the Marks :");
        Marks = sobj.nextInt();

        System.out.println("Enter the Attendance Percentage:");
        AttendancePercentage = sobj.nextInt();

        System.out.println("Enter the Family Income :");
        FamilyIncome = sobj.nextInt();

        if(Marks < 0 || Marks > 100)
        {
            System.out.println("Marks must be between 0 and 100");
            sobj.close();

            return;
        }

        if(AttendancePercentage < 0 || AttendancePercentage > 100)
        {
            System.out.println("Attendance must be between 0 and 100");
            sobj.close();

            return;
        }

        if(FamilyIncome < 0)
        {
            System.out.println("Income cannot be negative");
            sobj.close();

            return;
        }

        if(Marks >= 80 && AttendancePercentage >= 75 && FamilyIncome <= 300000 )
        {
            System.out.println("Scholarship Approved");
        }
        else
        {
            System.out.println("Condition not satisfied");
        }
         

        sobj.close();
    }    
}