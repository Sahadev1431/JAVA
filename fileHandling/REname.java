import java.io.*;
public class REname {
    public static void main(String[] args) {
        File f = new File("1st.txt");
        File n =  new File("renamed.txt");

        if(f.exists())
        {
            System.out.println(f.renameTo(n));
        }
        else
        {
            System.out.println("not exist");
        }
    }
}
