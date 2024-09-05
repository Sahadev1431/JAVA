import java.util.*;
import java.util.stream.Stream;
public class Stream1 {

    public static void main(String[] args) {
        List<Integer>nums = Arrays.asList(4,5,6,7,8,9,10,11,12,13,14);
        String[]strArr = {"//","1","2","3"};

        Stream <Integer> data = nums.stream();

        // Stream <Integer> evens = data.filter(element -> element % 2 ==0);
        // evens.forEach(ele -> System.out.println(ele));
        int sum = Arrays.stream(strArr).map(element -> Integer.valueOf(element)).reduce(0,Integer::sum);
        System.out.println(sum);
    }
}