public class InteruptMethod {
    public static void main(String[] args) {
        test t1 = new test();
        Thread ob =  new Thread(t1);
        ob.start();
        ob.interrupt();
    }
}

class test implements Runnable {
    public void run()
    {
        try
        {
            for (int i = 1; i <= 5; i++ )
            {
                System.out.println(Thread.currentThread().getName()+" "+i);
                if (i == 3)
                {
                    Thread.sleep(1000);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Thread Interupted");
            e.printStackTrace();
        }
    }
} 
