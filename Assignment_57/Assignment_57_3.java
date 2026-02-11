
import java.io.File;
import java.util.Scanner;

/*
Write a Java program to accept directory name from user
and create that directory.
*/


class Assignment_57_3 
{
    public static void main(String A[]) throws Exception
    {
    
        String DirName = null;
        File fobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Name Of Directory ");
        DirName = sobj.nextLine();
        
        fobj = new File(DirName);

        if(fobj.mkdir())
        {
            System.out.println("Directory gets created succesfully");
        }
        else
        {
            System.out.println("Directory already exists or cannot be created");
        }

        sobj.close();
    }
    
}
