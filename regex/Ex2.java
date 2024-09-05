import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] args) {
        String temp = "a*b";       // * means zero or more characters of a and last should be b;

        Pattern pattern = Pattern.compile(temp);
        Matcher matcher = pattern.matcher("aaab");

        boolean result = matcher.matches();

        System.out.println(result);
    }
}
