public class ThreadUsingRunnableInface implements Runnable {
    public void run()
    {
        System.out.println("threada using runnable interface");
    }
    public static void main(String[] args) {
        ThreadUsingRunnableInface t1 = new ThreadUsingRunnableInface();
        Thread th = new Thread(t1);
        th.start();
    }
}