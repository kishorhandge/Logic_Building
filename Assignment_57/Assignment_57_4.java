
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/*
Write a Java program to accept file name from user,
calculate checksum of that file and display it on screen.
*/


class Assignment_57_4
{
    public static void main(String A[]) throws Exception
    {
    
        String FileName = null;
        File fobj = null;
        int iRet = 0;
        int iSum = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of  file");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        FileInputStream fiobj = new FileInputStream(FileName);

        fobj.createNewFile();

        while((iRet = fiobj.read()) != -1)
        {
            iSum = iSum + iRet;
        }

        fiobj.close();
        sobj.close();

        System.out.println("Checksum of file is: " + iSum);
    }
    
}
