package RECURSION;

public class RecursiveBinary {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,55,66,77};
        int target = 77;
        System.out.println(recursiveBin(arr, target, 0, arr.length-1));
    }
    
    static int recursiveBin(int[] arr,int target,int start,int end) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (target == arr[mid]) return mid;

        if (target < arr[mid]) {
            return recursiveBin(arr, target, start, mid-1);
        }
        
        return recursiveBin(arr, target, mid+1, end);
    }
}


