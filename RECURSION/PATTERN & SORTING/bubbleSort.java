import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,2,5,8,6};
        bSort(arr, arr.length -1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bSort(int[] arr, int i, int j) {
        // { 4,2,5,8,6}
        if (i == 0) return ;

        if (j < i) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            bSort(arr, i, j+1);
        } else {
            bSort(arr, i-1, 0);
        }
    }
}
