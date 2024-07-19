public class CheckPalindrome {

    public static void main(String[] args) {
        String s = "";
        System.out.println(checkPalin(s));
    }
    static boolean checkPalin(String s) {
        if (s.isEmpty()) {
            return false;
        }
        int start = 0,end = s.length()-1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}