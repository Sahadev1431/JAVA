import java.util.Scanner;
public class Loop
{
    public static void main (String [] args)
    {
        // for(int i = 1;i<=5;i++)
        // {
        //     System.out.println(i);
        // }



        // int i = 1;
        // while(i<=10)
        // {
        //     System.out.print(i+" ");
        //     i++;
        // }

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter number 2:");
        int num2 = in.nextInt();
        System.out.print("Enter number 3:");
        int num3 = in.nextInt();

        int max = num1;
        if(num2>max)
        {
            max = num2;
        }
        if(num3>max)
        {
            max = num3;
        }
        System.out.println(max);

        in.close();
    }
}