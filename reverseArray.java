import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        System.out.println("Enter number of elements to enter in array :");
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;++i)
        {
            System.out.println("Enter number " + (i+1)+":");
            arr[i] = in.nextInt();
        }
        for(int i = 0;i<n;++i)
        {
            System.out.print(arr[i]+" ");
        }
        reverse(arr);
        System.out.println();
        for(int i = 0;i<n;++i)
        {
            System.out.print(arr[i]+" ");
        }
        in.close();
        
    }
    static void reverse(int[]arr)
    {
        for(int i = 0 ; i< (arr.length/2);++i)
        {   int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
    
}
