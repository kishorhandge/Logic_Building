// ============================================================
// 4. Store Budget Purchase Calculator
//
// A customer enters a store with a fixed budget and picks
// items one by one in order.
//
// The program must calculate how many items can be purchased
// before money becomes insufficient.
//
// Input:
//   - Budget amount
//   - Number of items N
//   - N item prices
//
// Validations:
//   - Budget ≥ 0
//   - N ≥ 0
//   - Each item price > 0
//
// Expected Output:
//   - Items Purchased: <count>
//   - Remaining Balance: ₹<amount>
// ============================================================

import java.util.*;

class Assignment_76_4
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int BudgetAmount = 0;
        int NO_ofItem = 0;
        int Price = 0;
        int iCount = 0;

        int iCnt = 0;

        System.out.println("Enter the Budget amount :");
        BudgetAmount = sobj.nextInt();

        System.out.println("Enter the Number of items :");
        NO_ofItem= sobj.nextInt();

        if(BudgetAmount < 0)
        {
            System.out.println("Budget amount should be >= 0");
            sobj.close();

            return;
        }

        if(NO_ofItem < 0)
        {
            System.out.println("N Item should be >= 0");
            sobj.close();

            return;
        }

        for(iCnt = 1 ;iCnt <= NO_ofItem;iCnt++)
        {
            System.out.println("Enter the price of item : "+ iCnt + " :");
            Price = sobj.nextInt();

            if(Price <= 0)
            {
                System.out.println("Item price must be > 0");
                sobj.close();
                return;
            }

            if(Price <= BudgetAmount)
            {
                BudgetAmount = BudgetAmount - Price;
                iCount++;
            }
            else
            {
                break;
            }
        }

        System.out.println("Item purchased : "+ iCount );
        System.out.println("Remaining Balance :" +  BudgetAmount);


        sobj.close();
    }    
}