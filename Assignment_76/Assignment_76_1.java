// ============================================================
// 1. Ride-Hailing Trip Fare Calculator
//
// A ride-hailing app calculates trip fare based on distance
// and whether the trip occurred during peak hours.
//
// Rules:
//   - Base fare → ₹50
//   - First 10 km → ₹12 per km
//   - Beyond 10 km → ₹15 per km
//   - Peak hours → 20% extra on total fare
//
// Input:
//   - Distance in km (integer)
//   - Peak hour (Yes/No)
//
// Validations:
//   - Distance cannot be negative
//
// Expected Output:
//   - Distance: <km> km
//   - Peak Hour: <Yes/No>
//   - Total Fare: ₹<amount>
// ============================================================

import java.util.*;

class Assignment_76_1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        String PeakHour = null;
        int Distance = 0;

        int BaseFare = 50;

        System.out.println("Enter the distance :");
        Distance = sobj.nextInt();

        System.out.println("Enter the peak hour statu (YES/NO) :");
        PeakHour = sobj.next();

        if(Distance < 0)
        {
            System.out.println("Distance cannot be negative");
            sobj.close();

            return;
        }


        if(Distance <= 10)
        {
            BaseFare = BaseFare + (Distance * 12);
        }
        else if(Distance > 10)
        {
            BaseFare = BaseFare +  (120) + ((Distance - 10)* 15);
        }

        if(PeakHour.equalsIgnoreCase("Yes"))
        {
            BaseFare = BaseFare + (BaseFare*(20/100));
        }

        System.out.println("Distance: " + Distance + " km");
        System.out.println("Peak Hour: " + PeakHour);
        System.out.println("Total Fare: " + BaseFare);
         

        sobj.close();
    }    
}