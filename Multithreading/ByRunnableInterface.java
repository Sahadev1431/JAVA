class temp implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Jiya");
        }
    }
}

public class ByRunnableInterface {
    public static void main(String[] args) {
        temp t1 = new temp();
        Thread t = new Thread(t1);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Sahadev");
        }
    }
}
