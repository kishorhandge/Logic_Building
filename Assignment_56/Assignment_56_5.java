// 5. This program accepts a directory name from the user
//    and displays the names of all files
//    present inside that directory.


import java.io.File;
import java.util.Scanner;

class Assignment_56_5
{
    public static void main(String A[]) throws Exception
    {   
        File fobj = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of folder name:");
        String FileFolder = sobj.nextLine();

        fobj = new File(FileFolder);

        if(fobj.exists() && (fobj.isDirectory()))
        {   
            System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the folder are : "+fArr.length);

            for(int i = 0;i< fArr.length;i++)
            {
                System.out.println("File name :"+fArr[i].getName());
            }
             
        }
        else
        {
            System.out.println("File is already present");
        }

        sobj.close();
    }
}