// 4. This program accepts a file name from the user
//    and creates a new file with that name
//    if the file does not already exist.


import java.io.File;
import java.util.Scanner;

class Assignment_56_4
{
    public static void main(String A[]) throws Exception
    {   
        File fobj = null;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        String FileName = sobj.nextLine();

        fobj = new File(FileName);

        bRet = fobj.createNewFile();

        if(bRet == true)
        {   
            System.out.println("File created succesfully");
             
        }
        else
        {
            System.out.println("File is already present");
        }

        sobj.close();
    }
}