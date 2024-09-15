import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMEthod2 {
    public static void main(String[] args) {
        String regex = "sahdev";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher("sahdevnaisahdevsahdev");

        System.out.println(matcher.find(15));           // after 16 th character there will be no word sahdev
    }
}
