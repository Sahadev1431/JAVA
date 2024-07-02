
class InnerJoinMethod extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
    
}

public class JoinMethod {
    public static void main(String[] args) {
        InnerJoinMethod i1 = new InnerJoinMethod();
        InnerJoinMethod i2 = new InnerJoinMethod();
        InnerJoinMethod i3 = new InnerJoinMethod();
        InnerJoinMethod i4 = new InnerJoinMethod();

        i1.setName("11");
        i2.setName("22");
        i3.setName("33");
        i4.setName("44");

        i1.start();
        i2.start();
        try
        {
            i2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        i3.start();
        i4.start();
    }
}
