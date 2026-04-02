/*# ============================================================
# 3. University Result Generator
#
# Each student has marks in 5 subjects (each out of 100).
#
# Rules:
#   - If marks in any subject < 35 → Student is Fail
#   - If passed in all subjects, calculate average and classify:
#         Average >= 75 → Distinction
#         Average >= 60 → First Class
#         Average >= 50 → Second Class
#         Average < 50  → Pass
#
# Input:
#   - Five integers (marks in 5 subjects)
#
# Validations:
#   - Each mark must be between 0 and 100
#
# Expected Output:
#   - If fail:
#         "Result: Fail"
#   - Else:
#         "Average Marks: <avg>"
#         "Final Result: <Classification>"
# ============================================================
*/


import java.util.*;

class Assignment_74_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Marks[] = new int[5];
        int i = 0;
        int iSum = 0;

        boolean Pass = true;
        boolean Invalid = false;

        System.out.println("Enter Marks :");

        for(i = 0;i<Marks.length;i++)
        {
            Marks[i] = sobj.nextInt();

            if(Marks[i] < 35)
            {
                Pass = false;
            }

            if(Marks[i] < 0 || Marks[i] > 100)
            {
                Invalid = true;
            }

            iSum = iSum + Marks[i];
        }

        if(Invalid == true)
        {
            System.out.println("Invalid Marks");
            return;
        }

        if(Pass == false)
        {
            System.out.println("Result : Fail");
            return;
        }

        float AvgMarks= ((float)iSum / (float)5) ;

        System.out.println("Average Marks : "+AvgMarks);

        if(AvgMarks >= 75.0f)
        {
            System.out.println("Final Result : Distinction");
        }
        else if(AvgMarks >= 60.0f)
        {
            System.out.println("Final Result : First Class");
        }
        else if(AvgMarks >= 50.0f)
        {
            System.out.println("Final Result : Second Class");
        }
        else if(AvgMarks < 50.0f)
        {
            System.out.println("Final Result : Pass");
        }

        sobj.close();

    }
}