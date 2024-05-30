public interface Interrrfaceee {
    void run();

    public static void main(String[] args) {
        test t1 = new test();
        t1.run();
    }
}

class test implements Interrrfaceee{
    public void run()
    {
        System.out.println("hello");
    }
}

