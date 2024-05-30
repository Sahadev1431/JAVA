import java.util.Scanner;

public class linearSearch {
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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\nEnter number to find in array");
        int num = in.nextInt();
        
        System.out.println("element "+num+ " present on index "+lSearch(arr, num));


        in.close();
    }
    static int lSearch(int []arr,int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for(int i = 0;i < arr.length;++i)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
