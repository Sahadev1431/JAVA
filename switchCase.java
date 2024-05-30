import java.util.Scanner;
public class switchCase
{
    public static void main(String []args)
    {
        System.out.println("Enter name");
        Scanner in = new Scanner(System.in);
        String name = in.next();

        switch(name)
        {
            case "Sahadev" -> System.out.println("Harami");
            case "Jatin"   -> System.out.println("A pn harami");
            case "Gautam"  -> System.out.println("Tensniyo kido");
            case "Chirag"  -> System.out.println("Toperiyo");
            default        -> System.out.println("Enter valid choice");
        }
        in.close();        
    }
}