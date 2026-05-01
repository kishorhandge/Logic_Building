// ============================================================
// 5. Income Tax Calculator (Progressive Slabs)
//
// Tax is calculated based on annual income using slabs.
// Only the amount within each slab is taxed at that rate.
//
// Slabs:
//   - Up to ₹2,50,000 → 0%
//   - ₹2,50,001 to ₹5,00,000 → 5%
//   - ₹5,00,001 to ₹10,00,000 → 20%
//   - Above ₹10,00,000 → 30%
//
// Input:
//   - Annual income (integer)
//
// Validations:
//   - Income cannot be negative
//
// Expected Output:
//   - Annual Income: ₹<income>
//   - Total Tax Payable: ₹<tax>
// ============================================================

import java.util.*;

class Assignment_75_5
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int Annualincome = 0;
        float taxrate = 0.0f;

        System.out.println("Please enter the annual income:");
        Annualincome = sobj.nextInt();

        if(Annualincome < 0)
        {
            System.out.println("Income cannot be negative");
            sobj.close();

            return;
        }

        if(Annualincome <= 250000)
        {
            taxrate = 0;
        }

        if(Annualincome >= 250001 && Annualincome <= 500000 )
        {
            taxrate = ((Annualincome - 250000) * 0.05f);
        }
        if(Annualincome >= 500001 && Annualincome <= 100000)
        {
            taxrate = (0.05f *250000) + (Annualincome - 500000) * 0.20f;
        }
        else
        {
            taxrate = (0.05f *250000) + (0.20f *500000) + (Annualincome - 100000) * 0.30f;
        }

        System.out.println("Annual Income : "+ Annualincome);

        System.out.println("Total Tax Payable : "+taxrate);

        sobj.close();
    }    
}