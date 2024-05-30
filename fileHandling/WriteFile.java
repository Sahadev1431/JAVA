import java.io.*;
public class WriteFile {
    public static void main(String[] args) {
        
        try
        {
            FileWriter fo = new FileWriter("2Write.txt",true);
            try
            {
                fo.append("I love Java Language soo much ok 6th one");
                fo.append(System.lineSeparator());
            }
            finally
            {
                fo.close();
            }
            System.out.println("Writen successfully");
            
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
