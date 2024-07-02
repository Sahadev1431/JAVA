package RECURSION;

public class PrintNum {
    public static void main(String[] args) {
        r1(1);
    }

    static void r1(int n) {
        if (n>5) {
            return;
        }
        System.err.println(n);

        r1(n+1);
    }
}                                                                                 