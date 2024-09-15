import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List <String> list = Arrays.asList("aman","akash","ami","sahadev","jatin");

        List <String> startsWithA = list.stream().filter(ele -> ele.startsWith("a")).collect(Collectors.toList());
        System.out.println(startsWithA);
    }
}
