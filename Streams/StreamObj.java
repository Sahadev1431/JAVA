import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObj {
    public static void main(String[] args) {
        String [] arr = {"sahadev","jatin","gautam","chirag"};
        Stream <String> stream1 = Stream.of(arr);

        List<String> ans = stream1.filter(ele -> ele.endsWith("m")).collect(Collectors.toList());
        System.out.println(ans);
    }
}
