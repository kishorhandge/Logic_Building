// ------------------------------------------------------------
// Question 4:
// Accept a directory name and file extension from the user.
// Traverse the directory.
// Display only those files which match the given extension
// (example: .txt, .java, .pdf).
// ------------------------------------------------------------

import java.io.File;
import java.util.Scanner;

class Assignment_60_4
{
    public static void main(String A[])
    {
        String DirName = null;
        String Extension = null;
        File fobj = null;

        int iCnt = 0; 

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        DirName = sobj.nextLine();

        System.out.println("Enter extension name : ");
        Extension = sobj.nextLine();

        fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Directory is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the folder are : " + fArr.length);

                for(iCnt = 0; iCnt < fArr.length; iCnt++)
                {
                    if(fArr[iCnt].isFile())
                    {   
                        if(fArr[iCnt].getName().endsWith(Extension))
                        {
                            System.out.println("Name of file having given extension is : "+fArr[iCnt].getName());
                        }
                        
                    }
                }
        }
        else
        {
            System.out.println("Directory not found");
        }

        sobj.close();
    }
}