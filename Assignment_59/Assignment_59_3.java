/**
 * This program accepts a directory name from the user.
 * It displays only sub-directories
 * present inside the given directory.
 */

import java.io.File;
import  java.util.*;

public class Assignment_59_3 
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

            for(iCnt = 0;iCnt<fArr.length;iCnt++)
            {
                if(fArr[iCnt].isDirectory())
                {
                    System.out.println("Folder Name : "+fArr[iCnt].getName());
                }
            }

        }
        else
        {
            System.out.println("Invalid  Directory Name");
        }

    }
    
}