import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.RowFilter.Entry;
import javax.swing.text.html.parser.Entity;

import java.util.Iterator;

public class HashMapEx {
    public static void main(String[] args) {
        // HashMap hm = new HashMap<>();

        HashMap <Integer,String> hm = new HashMap<Integer,String>();  //key = int, value = string

        hm.put(101, "Sahadev");
        hm.put(102, "Jatin");
        hm.put(103, "Gautam");
        hm.put(104, "Chirag");

        System.out.println(hm);

        hm.put(104, "Mann");
        System.out.println(hm);

        System.out.println("Third one is "+hm.get(103));

        hm.remove(104);
        // System.out.println(hm);

        // System.out.println(hm.containsKey(104));
        // System.out.println(hm.containsValue("Gautam"));

        System.out.println(hm.keySet());
        System.out.println(hm.values());

        System.out.println(hm.entrySet());

        for (Object i : hm.keySet())
        {
            System.out.println(i);
        }

        for (Object i : hm.values())
        {
            System.out.println(i);
        }

        for (Object i : hm.keySet())
        {
            System.out.println(i + "    "+hm.get(i));
        }

        System.out.println("\n\nentry methods\n\n");
       
        for (Map.Entry<Integer,String> entry : hm.entrySet())
        {
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }
    }
}
