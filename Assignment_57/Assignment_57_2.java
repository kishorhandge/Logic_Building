
import java.io.File;
import java.util.Scanner;

/*
Write a Java program to accept file name from user and
check whether that file is a regular file or not.
*/


class Assignment_57_2 
{
    public static void main(String A[]) throws Exception
    {
    
        String FileName = null;
        File fobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of  file");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        fobj.createNewFile();

        if(fobj.isFile())
        {
            System.out.println("It is a regular file");

        }
        else
        {
            System.out.println("It is not regular file");
        }

        sobj.close();
    }
    
}
