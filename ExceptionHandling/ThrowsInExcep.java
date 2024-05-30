import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsInExcep {
    public static void main(String[] args) {
        ReadAndWrite r1 = new ReadAndWrite();
        try
        {
            r1.readFile();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Not handled");
        }
        System.out.println("compiled and ran successfully");
    }
}

class ReadAndWrite 
{
    void readFile() throws FileNotFoundException
    {
        FileInputStream f1 = new FileInputStream("d:/abc.txt");
    }
}
