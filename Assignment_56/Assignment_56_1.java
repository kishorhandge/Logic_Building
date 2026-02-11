 

/*
1. This program accepts a file name from the user
   and opens the specified file using Java File handling classes.
*/

import java.io.File;
import java.util.Scanner;

class Assignment_56_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File successfully opened");
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}
