import java.util.Scanner;
public class maxInArray {
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

        System.out.println("Greatest among all elements is "+ greatest(arr));
        in.close();
    }
    static int greatest(int []arr)
    {
        int max = arr[0];
        for(int i = 0; i < arr.length ;++i)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
