package bubblesort;
import java.util.Arrays;

public class bubblySort {
    public static void main(String[] args) {
        int [] arr = {6,5,4,3,2,1};
        System.out.println("before");
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println("after");
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[]arr) 
    {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++)
        {
            swapped = false;
            for (int j = 1; j <=arr.length - i - 1; j++)
            {
                if (arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            {
                break;
            }
        }
    }
}
