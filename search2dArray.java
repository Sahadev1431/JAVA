import java.util.Arrays;
public class search2dArray {
    public static void main(String[] args) {
        int[][]arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        int target = 18;
        // System.out.println("element present at index "+search(arr,target));

        int []ans = searchIndex(arr, target);
        System.out.println("Element present at index "+Arrays.toString(ans));
    }

    // static int search(int[][]arr,int target)
    // {
    //     int count = 0;
    //     for(int row = 0;row<arr.length;++row)
    //     {
    //         for(int col = 0; col<arr[row].length;col++)
    //         {
    //             if(target == arr[row][col])
    //             {
    //                 return count;
    //             }
    //             count ++;
    //         }
    //     }
    //     return -1;
    // }

    static int[]searchIndex(int[][]arr,int target)
    {
        for(int row = 0;row<arr.length;++row)
        {
            for (int col = 0;col<arr[row].length;++col)
            {
                if(arr[row][col] == target)
                {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

