class PrimeClass extends Thread {
    private int sleeptime;
    Object lock;
    boolean isRunning = true;

    PrimeClass(int sleeptime, Object lock) {
        this.sleeptime = sleeptime;
        this.lock = lock;
    }

    @Override
    public void run() {
        int num = 2;
        while (isRunning) {
            if (isPrime(num)) {
                System.out.println(num);

                synchronized (lock) {
                    if (num == 13) {
                        try {
                            System.out.println("Prime has stopped");
                            lock.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (num == 79) {
                        lock.notify();
                    }
                }

                try {
                    Thread.sleep(sleeptime);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            num++;
        }
    }

    public boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void stopRunning() {
        isRunning = false;
    }
}

class WorkerThread extends Thread {
    String name;
    boolean isRunning;

    WorkerThread(String name) {
        this.name = name;
    }

    public void run() {
        while (isRunning) {
            System.out.println(name + " is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name+ " Exited");
    }

    public void stopRunning() {
        isRunning = false;
    }
}

public class Main2 {
    public static void main(String[] args) {
        int mainSleep = Integer.parseInt(args[0]);
        int PrimeSleep = Integer.parseInt(args[1]);

        Object lock = new Object();

        PrimeClass p1 = new PrimeClass(PrimeSleep, lock);
        WorkerThread t1 = new WorkerThread("t1");
        WorkerThread t2 = new WorkerThread("t2");

        t1.start();
        t2.start();
        p1.start();
    }
}
