// ============================================================
// 2. Personal Loan Eligibility Checker
//
// The system checks whether a customer is eligible for a loan.
//
// Eligibility Conditions:
//   - Age between 21 and 60 (inclusive)
//   - Monthly income >= ₹25,000
//   - Credit score >= 700
//   - Must NOT have an existing unpaid loan
//
// Input:
//   - Age
//   - Monthly income
//   - Credit score
//   - Existing unpaid loan (Yes/No)
//
// Validations:
//   - Age, income, and score must be non-negative
//   - Yes/No input must be valid
//
// Expected Output:
//   - "Loan Approved"
//   OR
//   - "Loan Rejected: <Specific Reason>"
// ============================================================

import java.util.*;

class Assignment_75_2
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0, MonthlyIncome = 0 , CreditScore = 0;
        String UnpaidLoad = null;

        System.out.println("Enter the Age");
        Age = sobj.nextInt();

        System.out.println("Enter the Monthly Income");
        MonthlyIncome = sobj.nextInt();

        System.out.println("Enter the CreditScore");
        CreditScore = sobj.nextInt();

        System.out.println("Enter the Unpaid load status (YES / NO)");
        UnpaidLoad = sobj.next();

        if(Age <= 0 && MonthlyIncome < 0 && CreditScore < 0)
        {
            System.out.println("Age, income, and score must be non-negative");
            sobj.close();

            return;
        }

        if((UnpaidLoad.equalsIgnoreCase("YES") == false) && (UnpaidLoad.equalsIgnoreCase("NO") == true) )
        {
            System.out.println("Invalid Input");
            sobj.close();

            return;
        }

        if(Age < 21 || Age > 60)
        {
            System.out.println("Loan Rejected : Age should be in 21 and 60");
        }

        else if(MonthlyIncome < 25000)
        {
            System.out.println("Income should be >= 25000/-");
        }

        else if(CreditScore < 700)
        {
            System.out.println("Credit score must be >= 700");
        }

        else
        {
            System.out.println("Loan Approved");
        }
        
        sobj.close();
    }
}