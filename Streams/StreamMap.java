import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,6,7,8,9,10);

        List<Integer> squares = list.stream().map(ele -> ele * ele).collect(Collectors.toList());
        System.out.println(squares);
    }
}
