import java.io.*;
import java.util.Scanner;;
public class REaadFile {
    public static void main(String[] args) {
        try
        {
            FileReader fo = new FileReader("2Write.txt");
            Scanner sc = new Scanner(fo);
            try
            {
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
                // int i;
                // while ((i = fo.read()) != -1)
                // {
                //     System.out.print((char)i);
                // }

            }
            finally
            {
                fo.close();
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
