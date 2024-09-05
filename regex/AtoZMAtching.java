import java.util.regex.Pattern;

public class AtoZMAtching {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9]+";

        boolean result = Pattern.matches(regex, "ajkhsdASSDas6");

        System.out.println(result);
    }
}
