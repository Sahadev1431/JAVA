public class MAin {
    public static void main(String[] args) {
        // CustomStack stack = new CustomStack();
        // stack.add(10);
        // stack.add(20);
        // stack.add(30);
        // stack.add(40);
        // System.out.println( stack.peek());
        // stack.pop();
        // System.out.println(stack.peek());

        CustomQueue queue = new CustomQueue(10);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.front());
    }
       
}
