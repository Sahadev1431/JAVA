public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sum(1432));
    }
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        // or condition can be
        // if (n % 10 == n) {
        //     return n;
        // }
// 1432
        return (n % 10) + (sum(n / 10));
    }
}
