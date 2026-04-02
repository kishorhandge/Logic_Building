////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Question 1:
//  Write a program which accepts a matrix from the user and returns
//  the addition of diagonal elements.
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

    int AdditionDiagonal()
    {
        int i = 0,j = 0;
        int iSum = 0;

        for(i = 0;i<iRow;i++)
        {
            for(j = 0;j<iCol;j++)
            {
                if(Arr[i] == Arr[j])
                {
                    iSum = iSum + Arr[i][j];
                }
            }
            System.out.println();
        }

        return iSum;
    }

}

class Assignment_72_1
{
    public static void main(String A[])
    {   
        int iRet = 0;

        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();

        iRet = mobj.AdditionDiagonal();

        System.out.println("Addition of diagonal elements is : "+iRet);
 
    }
}