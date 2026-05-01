// ============================================================
// 5. Phone Battery Status Checker
//
// A phone OS displays battery warnings based on percentage.
//
// Rules:
//   - Battery ≤ 5% → Critical
//   - Battery ≤ 15% → Low
//   - Otherwise → Normal
//
// Input:
//   - Battery percentage (integer)
//
// Validations:
//   - Value must be between 0 and 100
//
// Expected Output:
//   - Battery Percentage: <value>%
//   - Status: <Critical/Low/Normal>
// ============================================================

import java.util.*;

class Assignment_76_5
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int BatteryPercentage = 0;

        System.out.println("Enter the Battery percentage : ");
        BatteryPercentage = sobj.nextInt();

        if(BatteryPercentage < 0)
        {
            System.out.println("Value must be between 0 and 100");
            return;
        }

        if(BatteryPercentage <= 5)
        {
            System.out.println("Critical!");
        }
        else if(BatteryPercentage <= 15)
        {
            System.out.println("Low battery!");
        }
        else
        {
            System.out.println("Normal");
        }

        sobj.close();

    }     
}