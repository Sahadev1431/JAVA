import java.util.Scanner;
import java.util.Arrays;
public class binarySearch
{
    public static void main(String[]args)
    {
        // int [] arr = {-69,-45,-26,-2,2,4,5,6,7,8,9,11,15};
        // int tar = -45;

        System.out.print("Enter number if elements you wanna insert in array:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter elements in sorted manner");
        for(int i = 0; i<arr.length;++i)
        {
            System.out.println("Enter element");
            arr[i] = in.nextInt();
        }
        
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter value to search that at which index that present :");
        int tar = in.nextInt();
        
        System.out.println("The element "+tar+" present at index "+binSearch(arr, tar));
        in.close();
    }

    static int binSearch(int []arr,int target)
    {
        int start = 0;
        int end = arr.length - 1;
        
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(target < arr[mid])
            {
                end = mid-1;
            }
            else if (target > arr[mid])
            {
                start = mid+1;
            }
            else    //target == mid
            {
                return mid;
            }
        }
        return -1;
    }
}