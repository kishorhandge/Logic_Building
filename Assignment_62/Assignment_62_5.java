
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// Question 5:
// Write a program in Java which accepts file name from user
// and handle all possible file related exceptions properly.


class Assignment_62_5 
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

        try
        {

        System.out.println("Enter the Source file name : ");
        FileName = sobj.nextLine();

        System.out.println("Enter the Backup file name : ");
        DestFileName = sobj.nextLine();

        fobj1 = new File(FileName);

        byte Buffer[] = new byte[100];

          
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
        
        catch(FileNotFoundException fnobj)
        {
            System.out.println("File not found:");
        }
        catch(IOException iobj)
        {
            System.out.println("Input Output error occured:");
        }
        catch(Exception e)
        {
            System.out.println("Unexpected error");
        }
         
        finally
        {
            sobj.close();
        }
        
    }
}
