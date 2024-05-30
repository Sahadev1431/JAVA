import java.io.*;
import java.util.Scanner;
public class CopyFile {
    public static void main(String[] args) {
        try
        {
            FileInputStream r = new FileInputStream("2Write.txt");
            FileOutputStream w = new FileOutputStream("CopyFile2.txt");
            Scanner sc = new Scanner(r);

            try
            {
                // while (sc.hasNextByte()) {
                //     w.write(sc.nextByte());
                // }
                int i;
                while ((i = r.read())!= -1)
                {
                    w.write((char)i);
                }
            }
            finally
            {
                r.close();
                w.close();
                sc.close();
            }
            System.out.println("Copied Successfully");
        }

        catch (IOException e)
        {
            System.out.println(e);
        }
        
    }
}
