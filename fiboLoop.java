import java.util.Scanner;
public class fiboLoop
{
    public static void main(String []args)
    {
        System.out.print("Enter number till you want to perform fibbonaci series:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int prev = 0;
        int current = 1;
        int count = 3;
        while(count<=num)
        {
            int temp = current;
            current = current + prev;
            prev = temp;
            count++;
        }
        System.out.println(num+"th fibonaci number is "+current);
        in.close();
    }


    // class FibonacciExample1{  
        // public static void main(String args[])  
    //     {    
    //      int n1=0,n2=1,n3,i,count=10;    
    //      System.out.print(n1+" "+n2);//printing 0 and 1    
            
    //      for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
    //      {    
    //       n3=n1+n2;    
    //       System.out.print(" "+n3);    
    //       n1=n2;    
    //       n2=n3;    
    //      }    
          
    // //     }}  
}
