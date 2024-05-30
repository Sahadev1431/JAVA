public class MainThreadJoin extends Thread {
    static Thread mainThread;
    public void run()
    {
        try
        {
            mainThread.join();
            for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        mainThread = Thread.currentThread();
        MainThreadJoin m1 = new MainThreadJoin();
        m1.start();

        try
        {
            for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            Thread.sleep(1000);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
