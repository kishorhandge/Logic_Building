////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Question 2:
//  Write a program which accepts a matrix and one number from the user
//  and returns the frequency of that number in the matrix.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;


class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    public Matrix(int a , int b)
    {   
        this.iRow = a;
        this.iCol = b;

        Arr =  new int[iRow][iCol];
    }

    void Accept()
    {
        int i = 0,j = 0;
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of matrix:");

        for(i = 0;i<iRow;i++)
        {   
            System.out.println("Enter the elements of Row : "+(i+1));

            for(j = 0;j<iCol;j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }


    }

    void Display()
    {
        int i = 0,j = 0;

        System.out.println("elements of matrix are :");

        for(i = 0;i<iRow;i++)
        {
            for(j = 0;j<iCol;j++)
            {
               System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    int Frequency(int iNo)
    {
        int i = 0,j = 0;
        int iCount = 0;

        for(i = 0;i<iRow;i++)
        {
            for(j = 0;j<iCol;j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iCount++;
                }
            }
            System.out.println();
        }

        return iCount;
    }

}

class Assignment_72_2
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        int iNo = 0;

        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();

        System.out.println("Enter the element that you want to measure frequency : ");
        iNo = sobj.nextInt();

        iRet = mobj.Frequency(iNo);

        System.out.println("Frequency of that element is: "+iRet);
 
    }
}