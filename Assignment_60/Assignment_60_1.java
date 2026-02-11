import java.io.File;
import java.util.Scanner;

// ------------------------------------------------------------
// Question 1:
// Accept a directory name from the user.
// Traverse that directory and calculate the total size
// of all files present inside it.
// Display the total size in bytes.
// ------------------------------------------------------------

class Assignment_60_1
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

            if(fArr != null)
            {
                System.out.println("Number of files in the folder are : " + fArr.length);

                for(iCnt = 0; iCnt < fArr.length; iCnt++)
                {
                    if(fArr[iCnt].isFile())
                    {
                        FileSizeCount = FileSizeCount + fArr[iCnt].length();
                    }
                }
            }

            System.out.println("Total size of all files is : " + FileSizeCount + " bytes");
        }
        else
        {
            System.out.println("Directory not found");
        }

        sobj.close();
    }
}
