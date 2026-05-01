// ============================================================
// 3. Warehouse Stock Management System
//
// The system checks if enough stock is available to fulfill
// a customer's order.
//
// Rules:
//   - If requested quantity > available stock → Order fails
//   - Else deduct requested quantity from stock
//   - If remaining stock < 5 → Show low stock alert
//
// Input:
//   - Current stock (integer)
//   - Requested quantity (integer)
//
// Validations:
//   - Stock cannot be negative
//   - Requested quantity must be > 0
//
// Expected Output:
//   - If successful:
//         "Order Processed Successfully"
//         "Remaining Stock: <value>"
//         If remaining < 5 → "Low Stock Alert!"
//   - If failed:
//         "Order Failed: Insufficient Stock"
// ============================================================

import java.util.*;

class Assignment_75_3
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int Currentstock = 0;
        int quantity = 0;

        System.out.println("Enter the current stock:");
        Currentstock = sobj.nextInt();

        System.out.println("Enter the request quantity:");
        quantity = sobj.nextInt();

        if(Currentstock <= 0 && quantity <= 0)
        {
            System.out.println("Stock cannot be negative or zero and requested quantity > 0");
            sobj.close();

            return;
        }

        if(quantity > Currentstock)
        {
            System.out.println("Order Failed: Insufficient Stock");
            return;
        }

        else if(Currentstock > quantity)
        {
            Currentstock = Currentstock - quantity;
        }

        else if(Currentstock < 5)
        {
            System.out.println("Low Stock Alert!");
        }

        
        System.out.println("Order Processed Successfully");
        System.out.println("Remaining Stock: "+Currentstock);
      

        sobj.close();

    }    
}