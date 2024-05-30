public class PrintExcepMethod {
    public static void main(String[] args) {
        int a = 100,b = 0,c = 2;
        try
        {   
            c = a / b;
        }
        catch(ArithmeticException e)
        {
            // System.out.println(e);
            // System.out.println(e.toString());  //this both will print excep name and description but not stack trace

            // System.out.println(e.getMessage());  //this will print only description
            e.printStackTrace();    // this will print eveerything stack trace also means in which line exception occured
        }
        finally
        {
            System.out.println(a/c);
        }
        System.out.println("Helo");
    }
}
