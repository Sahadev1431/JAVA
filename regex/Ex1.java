import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

    public static void main(String[] args) {
        String temp = "abc";

        Pattern pattern = Pattern.compile(temp);

        Matcher matcher = pattern.matcher("abc");
        boolean result = matcher.matches();

        System.out.println(result);
    }
}