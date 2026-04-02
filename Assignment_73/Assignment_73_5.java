// Accept a matrix and check if it is a sparse matrix.
// Sparse matrix means most of the elements are 0.
//
// Example:
//
// Input Matrix:
// 0  0  3
// 0  0  0
// 4  0  0
//
// Total elements = 9
// Zero elements = 7
//
// Output: True (because zeros are more)

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

    public boolean CheckZeros()
    {
        int i = 0,j = 0;

       int iZeroIcount = 0;
       int iTotal = iRow * iCol;


        for(i = 0;i<iRow;i++)
        {   
           for(j = 0;j<iCol;j++)
            {
                if(Arr[i][j] == 0)
                {
                    iZeroIcount++;
                }

            }

        }

        if(iZeroIcount > (iTotal/2))
        {
            return true;
        }
        else
        {
            return false;
        }

       
    }
}

class Assignment_73_5
{
    public static void main(String A[]) 
    {   
        boolean bRet = false;
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();

        bRet = mobj.CheckZeros();

        if(bRet == true)
        {
            System.out.println("Most of the elements are zeros (0)");
        }
        else
        {
            System.out.println("Most of the elements are not zeros (0)");
        }

         
    }
}