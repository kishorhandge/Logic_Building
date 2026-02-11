// 3. This program accepts a file name from the user,
//    opens the file in write/append mode,
//    and writes data at the end of the file.


import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

class Assignment_56_3
{
    public static void main(String A[]) throws Exception
    {   
        File fobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        String FileName = sobj.nextLine();

        fobj = new File(FileName);


        if(fobj.exists())
        {   
            FileOutputStream foobj = new FileOutputStream(fobj,true);   //When true is passed, the file is opened in append mode and the file
                                                                                //  pointer moves to the end, so new data is added without overwriting existing data.
            String str = "Jay Ganesh Jay Shri Krishna...";

            byte Arr[] = str.getBytes();

            foobj.write(Arr);

            System.out.println("Data written succesfully:");
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}