/**
 * This program accepts a directory name from the user.
 * It counts and displays the total number of files
 * and total number of folders in the directory.
 */

import java.io.File;
import java.util.Scanner;

public class Assignment_59_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        File fobj = null;

        String FolderName = null;
        
        int iCnt = 0;

        int FileCount = 0;
        int FolderCount = 0;

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
                    FileCount++;
    
                }
                else if(fArr[iCnt].isDirectory())
                {
                    FolderCount++;
                }
            }

            System.out.println("Number of files in the diretory are : "+FileCount);
            System.out.println("Number of folders in the diretory are : "+FolderCount);

        }
        else
        {
            System.out.println("Invalid  Directory Name");
        }

    }
    
}