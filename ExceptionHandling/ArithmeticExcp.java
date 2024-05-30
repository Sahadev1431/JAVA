public class ArithmeticExcp{
    public static void main(String[] args) {
        int a = 45;
        int b = 0;
        try
        {
            int c = a/b;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }


        System.out.println("res of code");
    }
}