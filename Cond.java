import java.util.Scanner;
public class Cond
{
    public static void main(String[] args)
    {
        System.out.print("Enter your salary:");
        Scanner input = new Scanner (System.in);
        int salary = input.nextInt();
        int tempSal = salary;
        if(salary >=10000)
        {
            salary+=2000;
        }
        else
        {
            salary-=1000;
        }

        System.out.println("Your old salary was "+tempSal+" And new Salary is "+salary);
        input.close();
    }
}