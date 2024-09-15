import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquaresSorted {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(56,233,45,4,5,6,7,8,9,10,1,2);
        // Stream <Integer> square = list.stream().map(ele -> ele * ele);
        // System.out.println(square);
        list.stream()
        .map(ele -> ele * ele).sorted()
        .forEach(ele -> System.out.println(ele));

        List <Integer> sortedSquaresEven = list.stream().filter(ele -> ele % 2 == 0).map(ele -> ele * ele).sorted().collect(Collectors.toList());
        System.out.println(sortedSquaresEven);

        int res = list.stream().filter(ele -> ele % 2 == 0).map(ele -> ele * ele).sorted().reduce(0, (c,e) -> c + e);
        System.out.println(res);
    }
}
