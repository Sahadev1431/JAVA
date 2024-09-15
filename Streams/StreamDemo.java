import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Stream <Integer> evenStream = list.stream();
        List<Integer> evenList = evenStream.filter(ele -> ele % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);

        List<Integer> great8 = list.stream().filter(ele -> ele > 8).collect(Collectors.toList());
        
        System.out.println(great8);
    }
}
