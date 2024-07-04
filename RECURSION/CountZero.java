public class CountZero {
    public static void main(String[] args) {
        System.out.println(zeroCounter(200200,0));
    }
    static int zeroCounter(int n,int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0){
            count ++;
        }
        return (zeroCounter(n / 10, count));
    }
}
