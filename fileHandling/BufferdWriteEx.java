import java.io.*;
public class BufferdWriteEx {
    public static void main(String[] args) throws IOException {
        FileWriter fo = new FileWriter("textaw.txt",true);
        BufferedWriter bf = new BufferedWriter(fo);
        bf.write("hello there");
        bf.close();
    }
}
