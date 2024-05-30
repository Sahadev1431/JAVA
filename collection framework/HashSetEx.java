import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class HashSetEx {
    public static void main(String[] args) {
        // HashSet hs = new HashSet<>(); // default capacity is 16;

        // HashSet hs = new HashSet<>(100); //  capacity is 100;

        // HashSet hs = new HashSet<>(100,(float)0.90); //  capacity is 100; and load factor will be 0.90 means after 90 % it will create new hashset obj

        // HashSet <Integer> hs = new HashSet<Integer>();  // to create hashset of only integer

        HashSet hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add("welcome");
        hs.add(true);
        hs.add(null);
        System.out.println(hs);
        // LinkedList lls =  new LinkedList<>(hs);
        // System.out.println("\n\nlls"+lls);


        hs.remove(20);
        System.out.println(hs);

        System.out.println(hs.contains("welcome"));

        System.out.println("reading with for loop");
        for (Object e : hs)
        {
            System.out.println(e);
        }

        System.out.println("\n reading using iterator");

        Iterator it = hs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println(hs);

        LinkedHashSet lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add("welcome");
        lhs.add(true);
        lhs.add(null);
        System.out.println(lhs);

        // in hashset duplicate not allowed and order is not maintained but in linked hashset duplicate not allowed but order is maintained
    }
}
