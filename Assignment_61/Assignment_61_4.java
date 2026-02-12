
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

// ------------------------------------------------------------
// Question 4
// Accept two input file names and one output file name
// Merge both input files into one output file
// First copy file1 content, then copy file2 content
// Use FileInputStream and FileOutputStream
// Logic:
//   Read file1 → Write to output
//   Read file2 → Write to output
// ------------------------------------------------------------


class Assignment_61_4 
{
    public static void main(String A[])  throws  Exception
    {
        int iRet = 0;
        String src = null;

        File fobjSrc1 = null;
        File fobjSrc2 = null;

        File fobjDest = null;

        boolean bRet = false;

        String FileNameSrc1 = null;
        String FileNameSrc2 = null;

        String FileNameDest = null;

        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);


        System.out.println("Enter the name of source1 file:");
        FileNameSrc1 = sobj.nextLine();

        System.out.println("Enter the name of source2 file:");
        FileNameSrc2 = sobj.nextLine();

        System.out.println("Enter the name of destination file:");
        FileNameDest = sobj.nextLine();

        fobjSrc1 = new File(FileNameSrc1);
        fobjSrc2 = new File(FileNameSrc2);

        if(fobjSrc1.exists() && fobjSrc2.exists())
        {
            fobjDest = new File(FileNameDest);

            fobjDest.createNewFile();

            FileInputStream fiobj1 = new FileInputStream(fobjSrc1);
            FileInputStream fiobj2 = new FileInputStream(fobjSrc2); 

            FileOutputStream foobj = new FileOutputStream(fobjDest);

            while(((iRet = fiobj1.read(Buffer)) != -1))
            {
                foobj.write(Buffer,0,iRet);
            }

            while(((iRet = fiobj2.read(Buffer)) != -1))
            {
                foobj.write(Buffer,0,iRet);
            }

            System.out.println("File Copied Succesfully.");   
            
            fiobj1.close();
            fiobj2.close();
            foobj.close();
        }
        else
        {
            System.out.println("There is no Such Source file");
        }
        sobj.close();

    }
}
