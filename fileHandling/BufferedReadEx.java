import java.io.*;
import java.util.Scanner;
public class BufferedReadEx  {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("textaw.txt"));
        Scanner sc = new Scanner(bfr);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
