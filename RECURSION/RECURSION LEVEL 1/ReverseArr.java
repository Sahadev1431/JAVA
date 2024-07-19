import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        // Reversearray(0, arr.length-1, arr);
        // System.out.println(Arrays.toString(arr));
        Reversearray2(0,arr);
        System.out.println(Arrays.toString(arr));


    }
    static void Reversearray(int start,int end,int [] arr) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        Reversearray(start+1, end-1, arr);
    }
    static void Reversearray2(int start,int [] arr) {
        if (start >= arr.length / 2) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[arr.length - start -1];
        arr[arr.length - start - 1] = temp;
        Reversearray2(start+1, arr);
    }
}
