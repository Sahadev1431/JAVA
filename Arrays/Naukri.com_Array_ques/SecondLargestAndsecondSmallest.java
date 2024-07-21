import java.util.Arrays;

public class SecondLargestAndsecondSmallest {
    public static void main(String[] args) {
        int[]arr = {1,2,4,7,7,5};
        System.out.println(Arrays.toString(Second_Largest_And_second_Smallest(arr)));

    }
    
    static int[] Second_Largest_And_second_Smallest(int[]arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        int smallest = arr[arr.length-1];
        int secondSmallest = Integer.MAX_VALUE;
        int[]ans = new int[2];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            if (arr[i] < secondSmallest && arr[i] > smallest) {
                secondSmallest = arr[i];
            }
        }
        ans[0] = secondLargest;ans[1] =secondSmallest;
        return ans;
    }

}
