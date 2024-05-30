import java.util.Scanner;
public class evenInArray {
    public static void main(String[] args) {
        System.out.println("Enter number of element you want to add in array");
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number ");
            arr[i] = in.nextInt();
        }

        System.out.println("Even numbers in array is as follows");
        evenArray(arr);
        in.close();
    }

    static void evenArray(int[]arr)
    {
        for(int i = 0; i < arr.length; ++i)
        {
            if(arr[i]%2 == 0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
