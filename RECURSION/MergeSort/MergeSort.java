import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    

    static int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;

        int [] mix = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] < right[i]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }

    static void mergeInPlaceSort(int[]arr,int start,int end) {
        if (arr.length == 1) {
            return;
        }

        int mid = arr.length / 2;

        mergeInPlaceSort(arr, start, mid);
        mergeInPlaceSort(arr, mid, arr.length);

        mergeInPlace(arr,start,mid,end);
    }
    static void mergeInPlace (int[]arr,int start,int mid,int end) {
        int i = start;
        int j = mid;
        int k = 0;

        int []mix = new int[end - start];

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
    }
}