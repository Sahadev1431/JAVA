import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(50);
        al.add("how are you");
        al.add(true);
        al.add(45.52);
        System.out.println(al);
        System.out.println(al.size());

        System.out.println("\n\nFOR EACH LOOP");
        al.forEach((n)->
        {
            System.out.println(n);
        });

        al.remove(2);
        System.out.println(al);

        al.remove("how are you");
        System.out.println(al);

        al.add(1,"welcome");
        System.out.println(al);

        System.out.println(al.get(2));

        al.set(1, "not welcome");
        System.out.println(al);

        System.out.println(al.contains(45.52));
        System.out.println(al.isEmpty());

        System.out.println("Reading with for----");
        for (int i = 0 ; i < al.size(); i++ ) {
            System.out.println(al.get(i));
        }

        System.out.println("using for each -----------");
        for(Object e : al)
        {
            System.out.println(e);
        }

        System.out.println("Using iterator ----------");
        
        Iterator it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        ArrayList <Integer> al2 = new ArrayList<>();
        al2.add(45);
        al2.add(52);
        System.out.println(al2);;
        // al2.add("sahdev"); // not done al2 is type of int

    }
}