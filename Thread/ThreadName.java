public class ThreadName extends Thread {
    public void run() 
    {
        System.out.println("Inside user thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread task");
    }
    public static void main(String[] args) {
        ThreadName t1 = new ThreadName();
        ThreadName t2 = new ThreadName();
        t1.start();
        t2.start();
        t1.setName("sahadev");
        t2.setName("jiya");
        System.out.println("this is the name of psvm thread "+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(t2.isAlive());
    }
}
