import java.util.Arrays;
public class varArgsFunc
{
    public static void main(String[]args)
    {
        fun(1,2,3,5);
    }

    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
