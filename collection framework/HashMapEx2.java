import java.util.*;
public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap <Integer,String> hm = new HashMap<Integer,String>();

        hm.put(101, "apple");
        hm.put(102, "banana");
        hm.put(103, "orange");

        for (Map.Entry<Integer,String> entry : hm.entrySet())
        {
            System.out.println(entry + "     "+ entry.getKey());
        }

        hm.putIfAbsent(103,"banana");
        System.out.println(hm);

        // hm.remove(101);
        hm.remove(102, "banana");
        System.out.println(hm);
    }
}
