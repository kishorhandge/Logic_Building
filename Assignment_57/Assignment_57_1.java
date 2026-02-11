
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/*
Write a Java program to accept two file names from user.
Open first file and create new file (second name) and
copy the data from first file into newly created file.
*/


class Assignment_57_1 
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        String str = null;

        boolean bRet = false;

        String FileNameSrc = null;
        String FileNameDest = null;

        File fobjsrc = null;
        File fobjdest = null;

        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source file");
        FileNameSrc = sobj.nextLine();

        System.out.println("Enter the name of destination file");
        FileNameDest = sobj.nextLine();

        fobjsrc = new File(FileNameSrc);

        if(fobjsrc.exists())
        {
            fobjdest = new File(FileNameDest);

            fobjdest.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobjsrc);

            FileOutputStream foobj = new FileOutputStream(fobjdest);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }

            System.out.println("File copied succesfully:");

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
