import java.util.Scanner;

class PrimeThread extends Thread {
    private final int sleepTime;
    private boolean running = true;
    private final Object lock;

    public PrimeThread(int sleepTime, Object lock) {
        this.sleepTime = sleepTime;
        this.lock = lock;
    }

    @Override
    public void run() {
        int number = 2;
        while (running) {
            if (isPrime(number)) {
                System.out.println("Prime: " + number);

                synchronized (lock) {
                    if (number == 13) {
                        try {
                            System.out.println("PrimeThread: T1 goes to wait mode.");
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else if (number == 79) {
                        System.out.println("PrimeThread: T1 resumes.");
                        lock.notify();
                    }
                }

                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            number++;
        }
        System.out.println("PrimeThread exited.");
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void stopRunning() {
        running = false;
    }
}



class WorkerThread extends Thread {
    private final String name;
    private boolean running = true;

    public WorkerThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (running) {
            System.out.println(name + " is working...");
            try {
                Thread.sleep(1000); // Simulate work with sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " exited.");
    }

    public void stopRunning() {
        running = false;
    }
}

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide sleep time for main thread and prime thread as command line arguments.");
            return;
        }

        int mainSleepTime = Integer.parseInt(args[0]);
        int primeSleepTime = Integer.parseInt(args[1]);

        Object lock = new Object();

        PrimeThread primeThread = new PrimeThread(primeSleepTime, lock);
        WorkerThread t1 = new WorkerThread("T1");
        WorkerThread t2 = new WorkerThread("T2");

        primeThread.start();
        t1.start();
        t2.start();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Press '1' to stop T1, '2' to stop T2, 'ENTER' to stop PrimeThread");
                String input = scanner.nextLine();

                if (input.equals("1")) {
                    t1.stopRunning();
                } else if (input.equals("2")) {
                    t2.stopRunning();
                } else if (input.isEmpty()) {
                    primeThread.stopRunning();
                    break;
                }
                Thread.sleep(mainSleepTime);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            primeThread.join();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exited.");
    }
}
