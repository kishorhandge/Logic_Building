
////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Question 4:
//  Write a program which accepts a matrix and displays the addition
//  of elements from each column.
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

    void AdditionCol() 
    {
        int i = 0, j = 0;

        int iSum = 0 ;

        for (j = 0; j < iCol; j++) 
        {   
            iSum = 0;

            for (i = 0; i < iRow; i++) 
            {   
                iSum = iSum + Arr[i][j];
                
            }
            System.out.println("Addition of Column : "+(j+1)+" is "+ iSum);
        }
    }

}

class Assignment_72_4 
{

    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        int iNo = 0;

        Matrix mobj = new Matrix(4, 4);

        mobj.Accept();
        mobj.Display();

        mobj.AdditionCol();
    }
}
