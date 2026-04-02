
////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Question 5:
//  Write a program which accepts a matrix and swaps the contents
//  of consecutive rows.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////
/// 

import java.util.Scanner;

class Matrix {

    public int iRow;
    public int iCol;
    public int Arr[][];

    public Matrix(int a, int b) {
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

    void RowsSwap() 
    {
        int i = 0, j = 0;

        int temp = 0 ;

        for (i = 0; i < iRow-1; i+=2) 
        {   
            for (j = 0; j < iCol; j++) 
            {   
                temp = Arr[i][j];
                Arr[i][j] = Arr[i+1][j];
                Arr[i + 1][j] = temp;
                
            }
        }
    }

}

class Assignment_72_5 
{

    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        int iNo = 0;

        Matrix mobj = new Matrix(4, 4);

        mobj.Accept();
        mobj.Display();

        System.out.println("Matrix before swap ");

        mobj.RowsSwap();

        System.out.println("Matrix after swap ");

        mobj.Display();
    }
}
