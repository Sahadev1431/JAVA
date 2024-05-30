import java.io.File;
import java.io.IOException;
public class CreateingFile {
    public static void main(String[] args) {
        File fo = new File("1st.txt");
        
        try
        {if(fo.createNewFile())
        {
            System.out.println("file created");
        }
        else
        {
            System.out.println("no");
        }}
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
