import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMethod {
    public static void main(String[] args) {
        String str = "sahadev";

        Pattern pattern = Pattern.compile(str);

        Matcher matcher = pattern.matcher("sahadevJiya");

        System.out.println(matcher.find());     // find will return true if the sub sequence present in regex
    }
}
