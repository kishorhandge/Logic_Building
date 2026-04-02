
////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Question 3:
//  Write a program which accepts a matrix and returns the largest number
//  from both the diagonals.
//  
//  3  2  5  9
//  4  8  2  6
//  7  4  1  5
//  3  9  7  2
//
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

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

        for (i = 0; i < iRow; i++) {
            System.out.println("Enter the elements of Row : " + (i + 1));

            for (j = 0; j < iCol; j++) {
                Arr[i][j] = sobj.nextInt();
            }
        }

    }

    void Display() {
        int i = 0, j = 0;

        System.out.println("elements of matrix are :");

        for (i = 0; i < iRow; i++) {
            for (j = 0; j < iCol; j++) {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    int MaxDiagonal() 
    {
        int i = 0, j = 0;
        int iCount = 0;

        int iMax = Arr[0][0];

        for (i = 0; i < iRow; i++) 
        {
            for (j = 0; j < iCol; j++) 
            {
                if (i == j) 
                {

                    if (Arr[i][j] > iMax) 
                    {
                        iMax = Arr[i][j];
                    }
                }

                if(i + j == iCol - 1)
                {
                    if (Arr[i][j] > iMax) 
                    {
                        iMax = Arr[i][j];
                    }
                }
                
            }
            System.out.println();
        }

        return iMax;
    }

}

class Assignment_72_3 {

    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        int iNo = 0;

        Matrix mobj = new Matrix(4, 4);

        mobj.Accept();
        mobj.Display();

        iRet = mobj.MaxDiagonal();

        System.out.println("Maximum element from both diagonal is : " + iRet);

    }
}
