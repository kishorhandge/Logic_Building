import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * Write a Java program to accept a directory name from the user
 * and write the names of all files from that directory
 * into a newly created file named "Marvellous.txt".
*/


class Assignment_58_2
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String FolderName = null;
        String PackedName = null;
        int iCnt = 0;
        int iRet = 0;

        byte Buffer[] = new byte[100];

        System.out.println("Enter the name of Folder:");
        FolderName = sobj.nextLine();

        System.out.println("Enter the Packed File:");
        PackedName = sobj.nextLine();

        File fobj = new File(FolderName);

        if(fobj.exists() && fobj.isDirectory())
        {
           File packobj = new File(PackedName);

           packobj.createNewFile();

           FileOutputStream foobj = new FileOutputStream(packobj);

           FileInputStream fiobj = null;

           System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the folder are: "+fArr.length);

            for(iCnt = 0;iCnt<fArr.length;iCnt++)
            {   
                 
               String Name = fArr[iCnt].getName() + "\n";

                foobj.write(Name.getBytes());
                
            }
            foobj.close();
            System.out.println("File names written succesfully");
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
}