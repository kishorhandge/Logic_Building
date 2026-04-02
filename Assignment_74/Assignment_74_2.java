/*# ============================================================
# 2. ATM Withdrawal System
#
# The ATM must approve or reject a withdrawal request
# based on strict safety rules.
#
# Rules:
#   - Withdrawal amount must be a multiple of ₹100
#   - Maximum withdrawal per transaction is ₹25,000
#   - After withdrawal, minimum balance must be at least ₹1,000
#
# Input:
#   - Line 1: Current balance (integer)
#   - Line 2: Requested withdrawal amount (integer)
#
# Validations:
#   - If balance <= 0 or withdrawalAmount <= 0 → Invalid input
#
# Expected Output:
#   - If successful:
#         "Transaction Successful"
#         "Remaining Balance: ₹<newBalance>"
#   - If failed:
#         "Transaction Failed: <Reason>"
# ============================================================
*/


import java.util.*;

class Assignment_74_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter Your Current Balance :");
        int current_balance = sobj.nextInt();

        System.out.println("Please Enter The Amount That You Want Withdrawl :");
        int withdraw_amount = sobj.nextInt();

        if(current_balance < 0 || withdraw_amount <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(withdraw_amount % 100 != 0)
        {
            System.out.println("Transaction Failed : withdrwal amount should be multiple of 100 !");
        }

        else if(withdraw_amount > 25000)
        {
            System.out.println("Transaction Failed : Maximum withdrawal per transaction is 25000/- ");
        }

        else if(current_balance - withdraw_amount < 1000)
        {
            System.out.println("Transaction Failed : After withdrwal balance must be remian at least 1000/- ");
        }

        else
        {
            System.out.println("Transaction Succesfull.");
            System.out.println("Remaining Balance :"+ (current_balance - withdraw_amount));
        }

    }
}