public class SumOfN2 {

    public static void main(String[] args) {
        sum(3, 0);
        int ans = funcSum(3);
        System.out.println("ans " + ans);
    }
    static void sum(int i,int sum) {
        if (i < 1 ) {
            System.out.println(sum);
            return;
        }
        sum(i-1,sum+i);
    }
    static int funcSum(int n) {
        if (n < 1) {
            return 0;
        }
        return n + funcSum(n-1);
    }
}
