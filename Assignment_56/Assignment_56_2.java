// 2. This program accepts a file name from the user,
//    opens the file in read mode, and displays
//    the contents of the file on the screen.

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

class Assignment_56_2
{
    public static void main(String A[]) throws Exception
    {   
        File fobj = null;
        FileReader frobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        String FileName = sobj.nextLine();

        fobj = new File(FileName);


        if(fobj.exists())
        {   
            frobj = new FileReader(FileName);

            char Buffer[] = new char[100];

            frobj.read(Buffer,0,28);

            System.out.println("Data from file is : "+new String(Buffer));
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}
