public class ThreadExUsingThreadClass extends Thread {
    @Override
    public void run()
    {
        System.out.println("Thread task");
    }
    public static void main(String[] args) {
        ThreadExUsingThreadClass t1 = new ThreadExUsingThreadClass();
        t1.start();
    }
}