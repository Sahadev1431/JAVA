public class ReverseNum {
    public static void main(String[] args) {
        // reverse (57254);
        // System.out.println(ans);
        reverseNumber(45605);
    }

    // static int ans = 0;

    // static void reverse(int n) {
    //     // 12345
    //     if (n <= 0) {
    //         return;
    //     }
    //     int rem = n % 10;
    //     ans = ans * 10 + rem;
    //     reverse(n / 10);
    // }

    static void reverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n % 10);
        reverse(n / 10);
    }

    public static void reverseNumber(int number) {
        if (number < 10) {
            // prints the same number if the number is less than 10
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }
}