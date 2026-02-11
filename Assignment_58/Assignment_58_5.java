import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * Write a Java program to accept a directory name from the user
 * and write the data along with name and size of each file
 * into a newly created file named "Marvellous.txt".
*/

class Assignment_58_5
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

        File fobj = new File(FolderName); //It creates a File object that represents the folder path entered by the user.

        if(fobj.exists() && fobj.isDirectory())
        {
           File packobj = new File(PackedName);

           packobj.createNewFile();

           FileOutputStream foobj = new FileOutputStream(packobj);

           FileInputStream fiobj = null;

           System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();     //It gets all files and folders present inside the directory
                                               //And stores them as File objects in an array
 
            System.out.println("Number of files in the folder are: "+fArr.length);

            for(iCnt = 0;iCnt<fArr.length;iCnt++)
            {   
                fiobj = new FileInputStream(fArr[iCnt]);   //fArr[iCnt] -> represents one file inside the folder

                                                            //FileInputStream -> used to read data from that file

                String Header  = "\n File Name : " + fArr[iCnt].getName()+"\n File Size : " + fArr[iCnt].length() + "\n";
                foobj.write(Header.getBytes());

                System.out.println("File Name : "+ fArr[iCnt].getName());

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer,0,iRet);
                }
                String Footer = "\n--------------------------\n";   // Converts the footer string into bytes
                                                                    // and writes it into the output file
                foobj.write(Footer.getBytes());
                
                fiobj.close();
            }
            foobj.close();
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
}