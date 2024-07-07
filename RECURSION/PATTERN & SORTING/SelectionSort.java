import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {12,8,45,6,54};
        selection(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int [] arr, int i, int j,int max) {
        // {12,8,45,6,54}
        if (i == 0) return;
        if (j < i) {
            if (arr[j] > arr[max]) {
                selection(arr, i, j+1, j);
            } else {
                selection(arr, i, j+1, max);
            }
        } else {
            int temp = arr[i -1];
            arr[i-1] = arr[max];
            arr[max] = temp;
            selection(arr, i-1, 0, 0);
        }
    }
}
