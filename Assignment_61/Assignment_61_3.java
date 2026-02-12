
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

// ------------------------------------------------------------
// Question 3
// Accept file name and one string from user
// Append the given string at the end of the file
// Do not overwrite existing content
// Open file in append mode
// Use FileWriter(true) or FileOutputStream(true)
// Logic:
//   Open file → Move to end → Write string
// ------------------------------------------------------------


class Assignment_61_3 
{
    public static void main(String A[])  throws  Exception
    {

        File fobj = null;

        String FileName = null;
        String stringname = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source file:");
        FileName = sobj.nextLine();

        System.out.println("Enter the name of string file:");
        stringname= sobj.nextLine();

        fobj = new File(FileName);

        fobj.createNewFile();

        if(fobj.exists())
        {   

            FileOutputStream foobj = new FileOutputStream(FileName,true); //file open in append mode

            foobj.write(stringname.getBytes());
            
            System.out.println("string Copied at the end of file Succesfully.");   

            foobj.close();
            
        }
        else
        {
            System.out.println("There is no Such Source file");
        }
        sobj.close();

    }
}
