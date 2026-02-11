// ------------------------------------------------------------
// Question 5:
// Accept a path from the user.
// Check whether the given path exists or not.
// If it exists, determine whether it is a file or directory.
// Display the appropriate message.
// ------------------------------------------------------------


import java.io.File;
import java.util.Scanner;

class Assignment_60_5
{
    public static void main(String A[])
    {
        String pathName = null;
        File fobj = null;

        int iCnt = 0; 

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the path name : ");
        pathName = sobj.nextLine();

        fobj = new File(pathName);

        if(fobj.exists() )
        {
            System.out.println("Path is present");
              
            if(fobj.isFile())
            {   
                
                System.out.println("Name of file is : "+fobj.getName());
                
            }
            else if(fobj.isDirectory())
            {
                System.out.println("Name of directory is : "+fobj.getName());
            }
        }
        else
        {
            System.out.println("Directory not found");
        }

        sobj.close();
    }
}