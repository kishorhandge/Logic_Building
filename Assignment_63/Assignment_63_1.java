
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

// Q1: Accept source and destination file names from user.
// Copy the file using BufferedInputStream and BufferedOutputStream.

class Assignment_63_1
{
    public static void main(String A[]) throws Exception
    {   
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;

        File fobjSrc = null;
        File fobjDest = null;

        byte Buffer[] = new byte[100];

        String SourceFileName = null;
        String DestFileName = null;

        System.out.println("Enter the source file name:");
        SourceFileName = sobj.nextLine();

        System.out.println("Enter the destination file name:");
        DestFileName = sobj.nextLine();

        fobjSrc = new File(SourceFileName);

        if(fobjSrc.exists())
        {
            System.out.println("Folder is present:");

            fobjDest = new File(DestFileName);
            
            fobjDest.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobjSrc);

            FileOutputStream foobj = new FileOutputStream(fobjDest);

            while((iRet = fiobj.read(Buffer)) != -1)
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