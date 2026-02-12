
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

// Question 4:
// Write a program in Java which accepts file name from user
// and create a backup copy of it with name original_backup.ext.


class Assignment_62_4 
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        int iCount = 0;

        String FileName = null;
        String DestFileName = null;

        File fobj1 = null;
        File fobj2 = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Source file name : ");
        FileName = sobj.nextLine();

        System.out.println("Enter the Backup file name : ");
        DestFileName = sobj.nextLine();

        fobj1 = new File(FileName);

        byte Buffer[] = new byte[100];

        if(fobj1.exists() )
        {   
            fobj2 = new File(DestFileName);

            fobj2.createNewFile();

            System.out.println("File is present:");

            FileInputStream fiobj = new FileInputStream(fobj1);

            FileOutputStream foobj = new FileOutputStream(fobj2);

            while(((iRet = fiobj.read(Buffer)) != -1))
            {
               foobj.write(Buffer,0,iRet);
            }
            
            fiobj.close();
            foobj.close();

            System.out.println("Data succesfully copied into the file:");

        }
        else
        {
            System.out.println("There is no such file:");
        }
        sobj.close();
    }
}
