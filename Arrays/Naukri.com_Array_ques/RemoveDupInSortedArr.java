// import java.util.Arrays;

public class RemoveDupInSortedArr {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4,5,5};
        System.out.println(removeDuplicates(arr, arr.length));
        // System.out.println(Arrays.toString(removeDuplicates(arr, arr.length)));
    }
    public static int removeDuplicates(int[] arr,int n) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[count]) {
                count++;
                arr[count] = arr[i];
            }
        }
        return count+1;
    }
}
