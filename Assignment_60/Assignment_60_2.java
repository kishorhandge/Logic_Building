// ------------------------------------------------------------
// Question 2:
// Accept a directory name from the user.
// Traverse all files inside the directory.
// Find the file having the maximum size.
// Display the name of the largest file.
// ------------------------------------------------------------

import java.io.File;
import java.util.Scanner;

class Assignment_60_2
{
    public static void main(String A[])
    {
        String DirName = null;
        File fobj = null;

        int iCnt = 0;
        long FileSizeCount = 0;    

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        DirName = sobj.nextLine();

        fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Directory is present");

            File fArr[] = fobj.listFiles();

            long MaxSize = 0;
            File MaxFile = null;

            if(fArr != null)
            {
                System.out.println("Number of files in the folder are : " + fArr.length);

                for(iCnt = 0; iCnt < fArr.length; iCnt++)
                {
                    if(fArr[iCnt].isFile())
                    {
                        if(fArr[iCnt].length() > MaxSize)
                        {
                            MaxSize = fArr[iCnt].length();
                            MaxFile = fArr[iCnt];
                        }
                    }
                }

                System.out.println("Max Size File Name is : "+MaxFile.getName());
                System.out.println("Max File Size : "+MaxSize);
            }

            
        }
        else
        {
            System.out.println("Directory not found");
        }

        sobj.close();
    }
}