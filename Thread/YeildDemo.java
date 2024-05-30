public class YeildDemo extends Thread {
    public void run()
    {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
    public static void main(String[] args) {
        YeildDemo y1 = new YeildDemo();
        y1.start();
        Thread.yield();
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(Thread.currentThread().getName()+ " " + i);
        }
    }
}
