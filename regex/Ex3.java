import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ex3 {
    public static void main(String[] args) {
        String temp = "a*b+";           // + means atleast one charater of b at end.if there is no a then only b will be true

        Pattern pattern = Pattern.compile(temp);

        Matcher matcher = pattern.matcher("aaab");

        boolean result = matcher.matches();

        System.out.println(result);
    }
}
