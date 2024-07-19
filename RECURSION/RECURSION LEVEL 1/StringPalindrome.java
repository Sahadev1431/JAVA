public class StringPalindrome {
    public static void main(String[] args) {
        String s = "sasdfsas";
        System.out.println(checkPalin(0, s));
    }
    static boolean checkPalin(int i,String s) {
        if (i >= s.length()/2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return checkPalin(i+1, s);
    }
}
