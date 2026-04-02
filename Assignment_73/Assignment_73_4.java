// Accept a square matrix and check if it is an identity matrix.
// Identity matrix has:
// 1s on main diagonal (i == j)
// 0s in all other positions.
//
// Example:
//
// Input Matrix:
// 1  0  0
// 0  1  0
// 0  0  1
//
// Output: True

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

    public boolean CheckIdentity()
    {
        int i = 0,j = 0;

       boolean bFlag = false;

        for(i = 0;i<iRow;i++)
        {   
           for(j = 0;j<iCol;j++)
            {
                if(Arr[i][j] == 1)
                {
                    bFlag = true;
                }
            }

             
        }

        return bFlag;
    }
}

class Assignment_73_4
{
    public static void main(String A[]) 
    {   
        boolean bRet = false;
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();

        bRet = mobj.CheckIdentity();

        if(bRet == true)
        {
            System.out.println("It is a identity matrix");
        }
        else
        {
            System.out.println("It is not a identity matrix");
        }

         
    }
}
