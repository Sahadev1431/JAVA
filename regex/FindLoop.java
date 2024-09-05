import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindLoop {
    public static void main(String[] args) {
        String regex = "sahdev";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher("sahdevnaisahdevnaisahdev");

        while (matcher.find()) {
            System.out.println("Pattern found at index "+ matcher.start() + " to "  +( matcher.end() - 1));
        }
    }
}
