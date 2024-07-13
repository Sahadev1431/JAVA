public class CircularMain {
    public static void main(String[] args) {
        CirculerLL cl = new CirculerLL();
        

        cl.insert(10);
        cl.insert(20);
        cl.insert(30);
        cl.insert(40);
        cl.insert(50);
        cl.insert(60);
        cl.display();
        cl.delete(50);
        cl.display();
        System.out.println(cl.tail.val);

        // cl.delete(10);

        // cl.display();
    }
}
