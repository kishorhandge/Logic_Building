import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

// Q3: Accept source and destination directory names from user.
// Copy all files from source directory into destination directory.

class Assignment_63_3
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

            for(iCnt = 0; iCnt < fArr.length; iCnt++)
            {
                if(fArr[iCnt].isFile())
                {
                    FileInputStream fiobj =
                        new FileInputStream(fArr[iCnt]);

                    FileOutputStream foobj =
                        new FileOutputStream(DestFolderName + "/" + fArr[iCnt].getName());

                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        foobj.write(Buffer,0,iRet);
                    }

                    fiobj.close();
                    foobj.close();

                    System.out.println(fArr[iCnt].getName() + " copied");
                }
            }

            System.out.println("All files copied successfully.");
        }
        else
        {
            System.out.println("Source folder not found.");
        }

        sobj.close();
    }
}
