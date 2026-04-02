/*# ============================================================
# 1. Library Fine Calculator
#
# In a college library, students can keep a borrowed book
# for up to 7 days without penalty.
#
# Fine Rules:
#   - If returned within 7 days → No fine
#   - If kept 8 to 12 days → ₹5 per day beyond 7
#   - If kept more than 12 days:
#         ₹5 per day for days 8–12
#         ₹10 per day for each day beyond 12
#
# Input:
#   - One integer: total number of days book was kept (daysKept)
#
# Validations:
#   - If daysKept < 0 → Invalid input
#
# Expected Output:
#   - If daysKept <= 7:
#         "Returned on time. No fine applicable."
#   - Else:
#         "Total fine to be paid: ₹<fineAmount>"
# ============================================================

*/


import java.util.*;

class Assignment_74_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int TotalDays = 0;
        int Fine = 0;

        System.out.println("Enter the Number of days :");
        TotalDays = sobj.nextInt();

        if(TotalDays < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(TotalDays <= 7)
        {
            System.out.println("No Fine Applicable");
            return;
        }

        else if(TotalDays >= 8 && TotalDays <= 12)
        {
            Fine = (TotalDays - 7)*5;
        }

        else if(TotalDays > 12)
        {   
            // 20 - 7 - 5  = 
            Fine = (5 * 5) + ((TotalDays - 12) * 10);
        }

        System.out.println("Total Fine to be paid is : "+Fine);

    }
}