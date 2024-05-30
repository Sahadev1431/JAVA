import java.io.*;
public class FileInfo {
    public static void main(String[] args) {
        File fo = new File("1st.txt");

        if (fo.exists())
        {
            System.out.println("name"+fo.getName());
            System.out.println("path"+fo.getAbsolutePath());
            System.out.println(fo.length());
            System.out.println(fo.canWrite());
            System.out.println(fo.canRead());
            // fo.delete();
        }
    }
}
