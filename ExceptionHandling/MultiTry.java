public class MultiTry {
    public static void main(String[] args) {
        int a = 50;
        int b = 0;
        try
        {
            int c = a / b;
        }
        catch (Exception e)
        {
            System.out.println("division of zero doing");
            try
            {
                int d = a / b;
            }
            catch (ArithmeticException f)
            {
                f.printStackTrace();
            }
        }
    }
}
