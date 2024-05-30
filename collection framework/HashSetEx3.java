import java.util.HashSet;

public class HashSetEx3 {
    public static void main(String[] args) {
        HashSet set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        HashSet set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // set1.addAll(set2);
        // System.out.println("union is :" + set1);

        set1.retainAll(set2);
        System.out.println("Intersection is :"+set1);
    }
}