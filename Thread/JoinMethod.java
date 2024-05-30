public class JoinMethod extends Thread {
    public void run()
    {
        try
        {
            for (int i = 1; i <= 5 ; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            Thread.sleep(1000);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        JoinMethod j1 = new JoinMethod();
        j1.start();
        j1.join();
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
