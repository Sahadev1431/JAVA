import java.io.*;
import java.util.Scanner;
public class ReadInStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fo = new FileInputStream("2Write.txt");
        // Scanner sc = new Scanner(fo);
        // while (sc.hasNextLine()) {
        //     System.out.println(sc.nextLine());
        // }
        int i;
        do {
            i = fo.read();
            if(i != -1)
            {
                System.out.print((char)i);
            }

        } while (i != -1);
    }
}
