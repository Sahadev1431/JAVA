public class PriorityThread extends Thread {
    public void run()
    {
        System.out.println("child thread");
        System.out.println("The priority if child thread is "+getPriority());
    }
    public static void main(String[] args) {
        System.out.println("Priority of main thread is "+Thread.currentThread().getPriority());
        PriorityThread p1 = new PriorityThread();
        p1.start();
        p1.setPriority(10);
    }
}
