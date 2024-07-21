public class LeftRotateArrOnePlace {
    static int[] rotateArray(int[] arr, int n) {
        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = num; 
        return arr;
    }
}
