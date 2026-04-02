/*# ============================================================
# 4. Electricity Bill Calculator (Progressive Slabs)
#
# The company charges electricity bill based on slabs.
#
# Slabs:
#   - First 100 units → ₹5 per unit
#   - Next 100 units (101–200) → ₹7 per unit
#   - Above 200 units → ₹10 per unit
#
# Input:
#   - One integer: units consumed
#
# Validations:
#   - Units cannot be negative
#
# Expected Output:
#   - "Total Units Consumed: <units>"
#   - "Total Electricity Bill: ₹<amount>"
# ============================================================
*/


import java.util.*;

class Assignment_74_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Units = 0;
        int Amount = 0;

        System.out.println("Enter the Unit");
        Units = sobj.nextInt();

        if(Units < 0)
        {
            System.out.println("Unit Cannot be Negative!");
        }

        if(Units <= 100)
        {
            Amount = Units * 5;
            
        }

        else if(Units <= 200)
        {
            Amount = (100 * 5) + ((Units - 100) * 7);
             
        }

        else if(Units > 200)
        {
            Amount = (500 + 700) + ((Units - 200) * 10);
            
        }

        System.out.println("Total Units Consumed is : "+ Units);
        System.out.println("Electricity Bill is : "+Amount);

        sobj.close();

    }
}