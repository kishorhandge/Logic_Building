
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

// Question 2:
// Write a program in Java which accepts file name and integer N
// from user and copy first N bytes into a new file.


class Assignment_62_2 
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        int iCount = 0;
        int iNo = 0;

        String FileName = null;
        String DestFileName = null;

        File fobj1 = null;
        File fobj2 = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Source file name : ");
        FileName = sobj.nextLine();

        System.out.println("Enter the Destination file name : ");
        DestFileName = sobj.nextLine();

        System.out.println("Enter the Number : ");
        iNo = sobj.nextInt();

        fobj1 = new File(FileName);

        byte Buffer[] = new byte[iNo];

        if(fobj1.exists() )
        {   
            fobj2 = new File(DestFileName);

            fobj2.createNewFile();

            System.out.println("File is present:");

            FileInputStream fiobj = new FileInputStream(fobj1);

            FileOutputStream foobj = new FileOutputStream(fobj2);

            iRet = fiobj.read(Buffer);

            if(iRet > 0)
            {
                foobj.write(Buffer,0,iRet);
            }
            
            fiobj.close();
            foobj.close();

            System.out.println("First "+ iNo + " bytes succesfully copied into the file:");


        }
        else
        {
            System.out.println("There is no such file:");
        }
        sobj.close();
    }
}
