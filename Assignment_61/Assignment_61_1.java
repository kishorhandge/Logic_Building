
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

// ------------------------------------------------------------
// Question 1
// Accept source file and destination file from user
// Copy data from source file to destination file
// Copy should be done byte by byte (1 byte at a time)
// Use FileInputStream and FileOutputStream
// Logic:
//   Read 1 byte → Write 1 byte → Repeat until EOF
// ------------------------------------------------------------


class Assignment_61_1 
{
    public static void main(String A[])  throws  Exception
    {
        int iRet = 0;
        String src = null;

        File fobjSrc = null;
        File fobjDest = null;

        boolean bRet = false;

        String FileNameSrc = null;
        String FileNameDest = null;

        byte Buffer[] = new byte[1];

        Scanner sobj = new Scanner(System.in);


        System.out.println("Enter the name of source file:");
        FileNameSrc = sobj.nextLine();

        System.out.println("Enter the name of destination file:");
        FileNameDest = sobj.nextLine();

        fobjSrc = new File(FileNameSrc);

        if(fobjSrc.exists())
        {
            fobjDest = new File(FileNameDest);

            fobjDest.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobjSrc);

            FileOutputStream foobj = new FileOutputStream(fobjDest);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }

            System.out.println("File Copied Succesfully.");   
            
            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("There is no Such Source file");
        }
        sobj.close();

    }
}
