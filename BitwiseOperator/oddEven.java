import java.util.Arrays;

public class oddEven {

    public static void main(String[] args) {
        int n = 62;
        System.out.println(oddEven(n));


    }
    
    static boolean oddEven(int n) {
        return (n & 1) == 1;
    }
}