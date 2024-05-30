import java.util.*;
public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();

        ll.add("hello");
        ll.add(45);
        ll.add(15);
        ll.add("world");
        ll.add(true);
        ll.add(45.52);
        ll.add(3);
        System.out.println(ll);
        // ListIterator <Object> lit = ll.listIterator(ll.size());
        ListIterator <Object> lit = new ArrayList<>(ll).listIterator(ll.size());

        System.out.println("\nlist iterator");

        while(lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }
        System.out.println("-----------------");

        System.out.println("\n\n Iterator");

        Iterator nit = ll.iterator();

        while (nit.hasNext()) {
            System.out.println(nit.next());
        }

        System.out.println("--------------------");

        System.out.println("\n\n Descending iterator");

        Iterator dit = ll.descendingIterator();

        while (dit.hasNext()) {
            System.out.println(dit.next());
        }

        

        ll.remove(3);
        System.out.println(ll);
        ll.remove(3);
        System.out.println();
        ll.remove("hello");
        System.out.println(ll);

        ll.remove(45.52);
        System.out.println(ll);

    }
}