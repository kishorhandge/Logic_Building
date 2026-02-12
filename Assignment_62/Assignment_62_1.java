
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

// Question 1:
// Write a program in Java which accepts file name from user
// and display total number of bytes read from that file.



class Assignment_62_1 
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        int iCount = 0;

        String FileName = null;

        File fobj = null;

        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File is present:");

            FileInputStream fiobj = new FileInputStream(fobj);

            while(((iRet = fiobj.read(Buffer)) != -1))
            {
                iCount = iCount + iRet;
            }

            System.out.println("File is read succesfully:");

            System.out.println("Total number of bytes from file are : "+iCount);


        }
        else
        {
            System.out.println("There is no such file:");
        }
        sobj.close();
    }
}
