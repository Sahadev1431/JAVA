import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltStackAndQueue {

    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // stack.push(40);
        // stack.push(50);
        // System.out.println(stack.pop());
        // System.out.println(stack.peek());



        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(10);
        // queue.add(20);
        // queue.add(30);
        // queue.add(40);
        // queue.add(50);  


        // System.out.println(queue.peek());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove(20));
        // System.out.println(queue.peek());


        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);
        deque.add(60);
        deque.offerFirst(5);
        System.out.println(deque.peek());
        deque.removeFirst();
        System.out.println(deque.peek());

        deque.offerLast(70);
        System.out.println(deque.getLast());

    }
}