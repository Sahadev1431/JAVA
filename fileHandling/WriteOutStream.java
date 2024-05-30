import java.io.*;
public class WriteOutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo = new FileOutputStream("outFille.txt",true);
        String s = "Hello world java";
        char[] ch = s.toCharArray();

        for (int i = 0 ; i < ch.length;i++)
        {
            fo.write(ch[i]);
        }
        fo.close();
    }
}
