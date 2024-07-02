package RECURSION;

public class Fibonacci {
    public static void main(String[] args) {
        // System.out.println(fiboRecursive(50));
        fibo(50);
    }

    static int fiboRecursive(int n) {
        if (n < 2) {
            return n;
        }
        return fiboRecursive(n-1) + fiboRecursive(n-2);
    }

    //ITERATIVE
    static void fibo(int n) {
        int first = 0;
        int second = 1;
        int fibo = 0;
        System.out.println(0);
        for (int i = 0; i < n-1; i++) {
            first = second;
            second = fibo;
            fibo = first + second;
            System.out.println(fibo);
        }
    }
}
