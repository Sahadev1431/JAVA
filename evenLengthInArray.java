import java.util.Scanner;
// import java.util.*;

public class evenLengthInArray {
    public static void main(String[] args) {
        System.out.println("Enter number of element you want to add in array");
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number ");
            arr[i] = in.nextInt();
        }
        System.out.println("The number that have even length in array are as following :"+findEvenLength(arr));
        in.close();
    }
    
    static int findEvenLength(int []arr)
    {
        int count = 0;
        for(int i = 0;i < arr.length;++i)
        {
            if(even(arr[i]))
            {
                count++;
            }
        }
        return count;
        
    }

    static boolean even(int n)
    {
        int count = 0;
        while(n > 0)
        {
            n = n/10;
            count++;
        }
        if(count % 2==0)
        {
            return true;
        }
        return false;
    }
}
