import java.io.File;
import java.util.Scanner;

/**
 * Write a Java program to accept a directory name from the user
 * and display the names of all files from that directory
 * which are regular files.
 */

class Assignment_58_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        File fobj = null;
        String FolderName = null;
        int iCnt = 0;

        System.out.println("Enter the name of Folder:");
        FolderName = sobj.nextLine();

        fobj = new File(FolderName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the folder are: "+fArr.length);

            for(iCnt = 0;iCnt<fArr.length;iCnt++)
            {   
                if(fArr[iCnt].isFile())
                {
                    System.out.println("File Name : "+ fArr[iCnt].getName());
                }
                else
                {
                    System.out.println("It is not regular file");
                }
                
            }
            
        }
    }
}