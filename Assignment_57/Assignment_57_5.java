
import java.io.File;
import java.util.Scanner;

/*
Write a Java program to accept directory name from user
and display all file names from that directory along with
size of each file.
*/


class Assignment_57_5
{
    public static void main(String A[]) throws Exception
    {
    
        String DirName = null;
        File fobj = null;
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Name Of Directory ");
        DirName = sobj.nextLine();
        
        fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the folder are: "+fArr.length);

            for(iCnt = 0;iCnt<fArr.length;iCnt++)
            {
                System.out.println("File Name : "+ fArr[iCnt].getName()+ "  File Size : "+ fArr[iCnt].length() + " Bytes");
            }
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
    
}
