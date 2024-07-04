public class Palindrome {
    public static void main(String[] args) {
        int n = 121;
        int reversed = palindrome(n, 0);
        if (n == reversed) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }

    static int palindrome(int n,int temp) {
        //12321
        if (n == 0) {
            return temp;
        }
        temp = (temp * 10) + (n % 10);
        return palindrome(n / 10, temp);
    }
}
