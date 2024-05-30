public class FinalVariable {
    public static void main(String[] args) {
        // test t1 = new test();
    }
}

class test
{

    // In class final variable is initialized directly like final int speed = 100;
    // or else you can initialize only in constructor

    final int speed;
    test()
    {
        speed = 100;
        System.out.println("Speed is :"+speed);
    }

}
