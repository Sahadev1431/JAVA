public class ReverseString {
    public static void main(String[] args) {
        String s = "sahadev";
        System.out.println(revString(s));
    }
    static String revString(String s) {
        int i = s.length() -1;
        String ans = "";
        while (i >= 0) {
            ans += s.charAt(i);   
            i--;
        }
        return ans;
    }
}
