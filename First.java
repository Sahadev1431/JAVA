
import java.util.Scanner;

public class First
{
    public static void main(String[] args)
    {
        System.out.println("Hello World !");  
        System.out.println("My name is Sahadev");
        System.out.print("Enter a String :");
        Scanner input = new Scanner(System.in);
        System.out.print("The given string is :");
        System.out.println(input.nextLine());
        
        input.close();
    
    }
}