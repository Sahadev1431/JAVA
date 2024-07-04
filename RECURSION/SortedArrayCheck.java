public class SortedArrayCheck {
    public static void main(String[] args) {
        int [] arr = {2,4,6,12};
        System.out.println(normalCheck(arr));
        System.out.println(recursuveCheck(arr,0));
    }

    static boolean recursuveCheck(int[] arr,int index) {
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && recursuveCheck(arr, index+1);  //this is same like below code
        // if ((arr[index] < arr[index + 1]) && recursuveCheck(arr, index+1) == true) {
        //     return true;
        // } else {
        //     return false;
        // }
    }

    // static boolean normalCheck(int[] arr) {
    //     boolean flag = true;
    //     for (int i = 0 ; i < arr.length ;i++ ){
    //         for (int j = i; j < arr.length; j++) {
    //             if (arr[i] > arr[j]) {
    //                 flag = false;
    //                 return flag;
    //             }
    //         }
    //     }
    //     return flag;
    // }
    static boolean normalCheck(int[]arr) {
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] > arr[i+1] ) {
                return false;
            }
        }
        return true;
    }

    
}
