public class InterruptedAndIsInterrupted {

    public static void main(String[] args) {
        test t1 = new test();
        Thread obj = new Thread(t1);
        obj.start();
        obj.interrupt();
    }
}

class test implements Runnable {
    public void run ()
    {
        System.out.println(Thread.interrupted());
        // System.out.println(Thread.interrupted());
        // System.out.println(Thread.interrupted());
        // System.out.println(Thread.interrupted());
        
        // System.out.println(Thread.currentThread().isInterrupted());
        try
        {for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+ " "+ i);
            Thread.sleep(500);
        }
        }
        catch(Exception e)
        {
            System.out.println("Thread has been interrupted");
            e.printStackTrace();
        }
    }
}