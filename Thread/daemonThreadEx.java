public class daemonThreadEx extends Thread {
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("Daemon thread");
        }
        else
        {
            System.out.println("Normal Thread");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main thread");
        daemonThreadEx d1 = new daemonThreadEx();
        d1.setDaemon(true);
        d1.start();
    }
}
