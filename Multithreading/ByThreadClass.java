
class temp extends Thread {
    @Override
    public void run()  {
        try
        {
            for (int i = 0; i < 10; i++) {
                System.out.println("Sahadev");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        
    }
}

public class ByThreadClass {

    public static void main(String[] args) throws InterruptedException {
        temp t1 = new temp();
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Jiya");
            Thread.sleep(1000);
        }
    }
}
