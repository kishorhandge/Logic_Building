// Accept a matrix and reverse the elements of each row.
// Swap first and last element in every row.
//
// Example:
//
// Input Matrix:
// 1  2  3
// 4  5  6
//
// Output Matrix:
// 3  2  1
// 6  5  4

import java.util.Scanner;

class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    public Matrix(int a ,int b)
    {
        this.iRow = a;
        this.iCol = b;

        Arr = new int[iRow][iCol];
    }

    void Accept() 
    {
        int i = 0, j = 0;
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of matrix:");

        for (i = 0; i < iRow; i++) 
        {
            System.out.println("Enter the elements of Row : " + (i + 1));

            for (j = 0; j < iCol; j++) 
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

    }

    void Display() 
    {
        int i = 0, j = 0;

        System.out.println("elements of matrix are :");

        for (i = 0; i < iRow; i++) 
            {
            for (j = 0; j < iCol; j++) 
                {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void RowReverse()
    {
        int i = 0,j = 0;

        int temp = 0;

        for(i = 0;i<iRow;i++)
        {
            for(j = 0;j<iCol-1;j+=2)
            {
                temp = Arr[i][j];
                Arr[i][j] = Arr[i][j+2];
                Arr[i][j+2] = temp;
            }

            System.out.println();
        }
    }
}

class Assignment_73_2 
{
    public static void main(String A[]) 
    {
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();

        mobj.RowReverse();

        mobj.Display();
    }
}
