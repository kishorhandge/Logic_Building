/**
 * This program accepts a directory name from the user.
 * It displays each file name along with
 * its absolute path.
 */

import java.io.File;
import java.util.Scanner;

public class Assignment_59_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        File fobj = null;

        String FolderName = null;
        
        int iCnt = 0;

        System.out.println("Enter the name of folder : ");
        FolderName = sobj.nextLine();

        fobj = new File(FolderName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the folder are : "+fArr.length);

            for(iCnt = 0;iCnt<fArr.length;iCnt++)
            {
                if(fArr[iCnt].isFile())
                {
                    System.out.println("File Name : "+fArr[iCnt].getName());
                    System.out.println("File path : "+fArr[iCnt].getAbsolutePath());

                }

            }

        }
        else
        {
            System.out.println("Invalid  Directory Name");
        }

    }
    
}