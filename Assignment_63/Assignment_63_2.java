
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

// Q2: Copy a file using normal streams and buffered streams.
// Measure and display the time required for both methods.


class Assignment_63_2
{
    public static void main(String A[]) throws Exception
    {   
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;

        File fobjSrc = null;
        File fobjDest = null;

        byte Buffer[] = new byte[100];

        String SourceFileName = null;
        String DestFileName = null;

        String DestBuffer = null;

        System.out.println("Enter the source file name:");
        SourceFileName = sobj.nextLine();

        System.out.println("Enter the destination file name:");
        DestFileName = sobj.nextLine();

        System.out.println("Enter the destination file name:");
        DestBuffer = sobj.nextLine();

        fobjSrc = new File(SourceFileName);

        if(fobjSrc.exists())
        {
            System.out.println("Folder is present:");

            fobjDest = new File(DestFileName);
            
            fobjDest.createNewFile();

            long start = System.currentTimeMillis();

            // ================= NORMAL STREAM COPY =================

            FileInputStream fiobj = new FileInputStream(fobjSrc);

            FileOutputStream foobj = new FileOutputStream(fobjDest);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }

            fiobj.close();
            foobj.close();

            long end = System.currentTimeMillis();

            long normaltime = start - end;

            // ================= BUFFERED STREAM COPY =================

            start = System.currentTimeMillis();

            BufferedInputStream bfiobj = new BufferedInputStream(new FileInputStream(fobjSrc));

            BufferedOutputStream bfoobj = new BufferedOutputStream(new FileOutputStream(fobjDest));

            System.out.println("Data succesfully copied into the file:");

            
            while((iRet = bfiobj.read(Buffer)) != -1)
            {
                bfoobj.write(Buffer,0,iRet);
            }

            fiobj.close();
            foobj.close();

            end = System.currentTimeMillis();

            long Bufferedtime = start - end;

            // ================= RESULT =================
        System.out.println("Normal Stream Time   : " + normaltime + " ms");
        System.out.println("Buffered Stream Time : " + Bufferedtime + " ms");


        }
        else
        {
            System.out.println("There is no such file:");
        }

        sobj.close();
        
    }
}