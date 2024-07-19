public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(revNum(1331));
    }
    static int revNum (int num) {
        int rev = 0;
        while(num > 0) {
            int lastDig = num % 10;
            rev = (rev * 10) + lastDig;
            num /= 10;
        }
        return rev;
    }
}
