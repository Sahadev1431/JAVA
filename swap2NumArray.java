import java.util.Arrays;
public class swap2NumArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(Arrays.toString(arr));
        swap(arr, 2 , 5);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[],int index1 ,int index2)
    {
        int temp = arr[index1-1];
        arr[index1-1] = arr[index2-1];
        arr[index2-1] = temp;
    }
}
