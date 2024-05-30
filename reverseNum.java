import java.util.Scanner;
public class reverseNum
{
    public static void main(String []args)
    {
        System.out.println("Enter number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = num;
        int ans = 0;
        while(num>0)
        {
            int rem = num%10;           //45268
            ans = ans*10 +rem;
            num = num/10;
        }
        System.out.println("Reverse of "+temp+" is "+ ans);
        in.close();
    }
}