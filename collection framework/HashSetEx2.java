import java.util.HashSet;
public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet <Integer> evenNums = new HashSet <Integer>();
        evenNums.add(2);
        evenNums.add(4);
        evenNums.add(6);

        HashSet <Integer> oddNums = new HashSet <Integer> ();
        oddNums.add(1);
        oddNums.add(3);
        oddNums.add(5);
        System.out.println(oddNums);

        HashSet <Integer> nums = new HashSet <Integer> ();
        nums.addAll(evenNums);
        nums.addAll(oddNums);

        System.out.println(nums);

        nums.removeAll(evenNums);
        System.out.println(nums);
    }
}
