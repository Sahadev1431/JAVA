import java.util.Scanner;

public class Inputs
{
    public static void main(String[] args)
    {
        System.out.print("Enter your roll no :");
        Scanner input = new Scanner (System.in);
        int rollno = input.nextInt();
        input.nextLine();

        System.out.print("Enter your name :");
        String name = input.nextLine();
        
        System.out.println("Your roll no is :"+rollno);
        System.out.println("Your name is :"+name);

        input.close();


        // // TYPE CASTING

        // int n = (int)45.98;
        // System.out.print("the integer is :" +n);
    }
}