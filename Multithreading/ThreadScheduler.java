class temp implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class ThreadScheduler {
    public static void main(String[] args) {
        temp t1 = new temp();
        temp t2 = new temp();
        temp t3 = new temp();

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);

        th1.start();
        th2.start();
        th3.start();
    }
}
