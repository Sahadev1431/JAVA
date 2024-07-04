public class Nto1 {
    public static void main(String[] args) {
        // print(5);
        // System.out.println("reverse");
        // printReverse(5);
        // // printReverse(1); //first method
        printBoth(5);;
    }

    static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    static void printReverse(int n) {
        // if (n == 6) {
        //     return;
        // }
        // System.out.println(n);
        // printReverse(n+1);;

        if (n == 0) {
            return;
        }
        printReverse(n-1);
        System.out.println(n);
    }

    static void printBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
}
