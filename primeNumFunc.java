import java.util.Scanner;
public class primeNumFunc
{
    public static void main(String[]args)
    {   
        System.out.print("Enter a number :");
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        boolean ans = isPrime(num);
        System.out.println("The number "+num+" is prime - "+ans);
        in.close();
    }
    
    static boolean isPrime(int n)
    {
        for (int i = 2;i<n;i++)
        {
            
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}