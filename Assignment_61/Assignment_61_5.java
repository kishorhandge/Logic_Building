
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

// ------------------------------------------------------------
// Question 5
// Accept one file name from user
// Split that file into two separate files
// First half of data → file1
// Second half of data → file2
// Calculate file size and divide by 2
// Use buffer to copy half data into each file
// Logic:
//   Find size → size/2 → copy first half → copy second half
// ------------------------------------------------------------


class Assignment_61_5
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter source file name:");
        String src = sobj.nextLine();

        System.out.println("Enter first output file name:");
        String dest1 = sobj.nextLine();

        System.out.println("Enter second output file name:");
        String dest2 = sobj.nextLine();

        File fobj = new File(src);

        if(!fobj.exists())
        {
            System.out.println("Source file not found.");
            return;
        }

        FileInputStream fiobj = new FileInputStream(src);
        FileOutputStream foobj1 = new FileOutputStream(dest1);
        FileOutputStream foobj2 = new FileOutputStream(dest2);

        long size = fobj.length();     // total size
        long half = size / 2;         // split point

        byte Buffer[] = new byte[1024];
        int iRet;
        long count = 0;

        // copy first half
        while(count < half && (iRet = fiobj.read(Buffer)) != -1)
        {
            if(count + iRet > half)
            {
                iRet = (int)(half - count);
            }

            foobj1.write(Buffer, 0, iRet);
            count += iRet;
        }

        // copy remaining data
        while((iRet = fiobj.read(Buffer)) != -1)
        {
            foobj2.write(Buffer, 0, iRet);
        }

        fiobj.close();
        foobj1.close();
        foobj2.close();

        System.out.println("File split successfully.");

        sobj.close();
    }
}