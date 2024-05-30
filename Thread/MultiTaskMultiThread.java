public class MultiTaskMultiThread {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        myThread3 t3 = new myThread3();
        t1.start();
        t2.start();
        t3.start();
    }   
}

/**
 * InnerMultiTaskMultiThread
 */
class myThread1 extends Thread {
    public void run()
    {
        System.out.println("task 1");
    }
    
}
class myThread2 extends Thread {
    public void run()
    {
        System.out.println("task 2");
    }
    
}
class myThread3 extends Thread {
    public void run()
    {
        System.out.println("task 3");
    }
    
}
