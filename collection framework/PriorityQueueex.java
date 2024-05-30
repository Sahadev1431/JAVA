import java.util.PriorityQueue;

import java.util.Iterator;

public class PriorityQueueex {
    public static void main(String[] args) {
        PriorityQueue prq = new PriorityQueue<>();

        prq.add(10);
        prq.add(20);
        prq.add(30);
        prq.add(40);
        prq.add(40);
        prq.add(50);
        // prq.add("hello");   //cant add it only homogenous data
        // to add hetrogeneous data we use linked list that also implements queue

        // System.out.println(prq);
        // System.out.println("head is "+prq.element());   //exception if queue is empty
        // System.out.println("head is "+prq.peek());  //null if queue is empty


        // prq.remove();
        // System.out.println(prq);

        prq.poll();
        System.out.println(prq);
        // prq.remove();

        // using remove we remove() it will remove first element remove(30) will remove 30 from queue 
        // usinng poll it will only remove first ele

        //if queue is empty then remove will throw an exception on the other hand poll will return empty list


        Iterator it = prq.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
