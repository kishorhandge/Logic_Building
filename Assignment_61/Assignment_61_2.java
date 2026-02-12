
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

// ------------------------------------------------------------
// Question 2
// Accept source file and destination file from user
// Copy data using byte array buffer
// Instead of copying 1 byte, copy block of bytes (e.g. 1024 bytes)
// This method is faster than byte-by-byte copy
// Use byte[] buffer with FileInputStream and FileOutputStream
// Logic:
//   Read buffer → Write buffer → Repeat until EOF
// ------------------------------------------------------------


class Assignment_61_2 
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

        byte Buffer[] = new byte[1024];

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
