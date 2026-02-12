import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

// Q5: Read first 1 KB data from Combined.bin.
// Write that data into a new output file.


class Assignment_63_5
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        int iCnt = 0;

        byte Buffer[] = new byte[1024];

        System.out.println("Enter the source Folder name:");
        String SourceFolderName = sobj.nextLine();

        System.out.println("Enter the destination Folder name:");
        String DestFolderName = sobj.nextLine();

        File fobjSrc = new File(SourceFolderName);
        File fobjDest = new File(DestFolderName);

        if(fobjSrc.exists() && fobjSrc.isDirectory())
        {
            fobjDest.mkdir();

            File fArr[] = fobjSrc.listFiles();

            FileOutputStream foobj = new FileOutputStream("Combined.in");

            for(iCnt = 0; iCnt < fArr.length; iCnt++)
            {
                if(fArr[iCnt].isFile())
                {
                    FileInputStream fiobj = new FileInputStream(fArr[iCnt]);

                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        foobj.write(Buffer,0,iRet);
                    }

                    fiobj.close();

                    System.out.println(fArr[iCnt].getName() + " copied");
                }
            }

            foobj.close();

            System.out.println("All files merged into Combined.bin successfully.");
        }
        else
        {
            System.out.println("Source folder not found.");
        }

        sobj.close();
    }
}
