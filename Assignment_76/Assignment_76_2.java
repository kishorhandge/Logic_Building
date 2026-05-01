// ============================================================
// 2. Scholarship Eligibility Checker
//
// A scholarship committee approves students only if they
// meet all academic and financial conditions.
//
// Conditions:
//   - Marks ≥ 80%
//   - Attendance ≥ 75%
//   - Family income ≤ ₹3,00,000
//
// Input:
//   - Marks percentage (integer)
//   - Attendance percentage (integer)
//   - Family income (integer)
//
// Validations:
//   - Marks and attendance must be between 0 and 100
//   - Income cannot be negative
//
// Expected Output:
//   - "Scholarship Approved"
//   OR
//   - "Scholarship Rejected: <Reason>"
// ============================================================

import java.util.*;

class Assignment_76_2
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