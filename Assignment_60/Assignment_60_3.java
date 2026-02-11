// ------------------------------------------------------------
// Question 3:
// Accept a directory name from the user.
// Traverse all files inside the directory.
// Find the file having the minimum size.
// Display the name of the smallest file.
// ------------------------------------------------------------

import java.io.File;
import java.util.Scanner;

class Assignment_60_3
{
    public static void main(String A[])
    {
        String DirName = null;
        File fobj = null;

        int iCnt = 0;  

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        DirName = sobj.nextLine();

        fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Directory is present");

            File fArr[] = fobj.listFiles();

            long MinSize = Long.MAX_VALUE;
            File MinFile = null;

            if(fArr != null)
            {
                System.out.println("Number of files in the folder are : " + fArr.length);

                for(iCnt = 0; iCnt < fArr.length; iCnt++)
                {
                    if(fArr[iCnt].isFile())
                    {
                        if(fArr[iCnt].length() < MinSize)
                        {
                            MinSize = fArr[iCnt].length();
                            MinFile = fArr[iCnt];
                        }
                    }
                }

                System.out.println("Min Size File Name is : "+MinFile.getName());
                System.out.println("Min File Size : "+MinSize);
            }

        }
        else
        {
            System.out.println("Directory not found");
        }

        sobj.close();
    }
}