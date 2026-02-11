/**
 * This program accepts a directory name from the user.
 * It displays only regular files from the given directory.
 * Sub-directories are ignored.
 */

import java.io.File;
import  java.util.*;

public class Assignment_59_2 
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
                }
            }

        }
        else
        {
            System.out.println("Invalid  Directory Name");
        }

    }
    
}