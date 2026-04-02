// Accept a matrix and display its transpose.
// Transpose means converting rows into columns.
// Element at position (i, j) becomes (j, i).
//
// Example:
//
// Input Matrix:
// 1  2  3
// 4  5  6
//
// Transpose Output:
// 1  4
// 2  5
// 3  6

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

    void Accept() {
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

    public void Transpose()
    {
        int i = 0,j = 0;

        for(i = 0;i<iRow;i++)
        {
            for(j = 0;j<iCol;j++)
            {
                System.out.print(Arr[j][i] + " ");
            }

            System.out.println();
        }
    }
}

class Assignment_73_1 
{
    public static void main(String A[]) 
    {
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();

        mobj.Transpose();
    }
}
