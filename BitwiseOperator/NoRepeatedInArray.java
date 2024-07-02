import java.util.Arrays;

public class NoRepeatedInArray {
    public static void main(String[] args) {
        int [] arr = {2,3,5,2,4,3,5};
        Arrays.sort(arr);
        System.out.println(notRepeated(arr));
    }
    static int notRepeated (int[]arr) {
        int n = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0 ; j < arr.length ; j++) {
                if ((arr[i] ^ arr[j]) != 0) {
                    n = i;
                }
            }
        }
        return arr[n];
    }
}
