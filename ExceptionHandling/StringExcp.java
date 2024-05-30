public class StringExcp {
    public static void main(String[]args)
    {
        try
        {
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException f)
        {
            // f.printStackTrace();
            System.out.println("child one");
        }
        catch (Exception e)
        {
            System.out.println("parent one");
        }
        
    }
}
