import java.util.Arrays;
public class BinSearch2dArray {
    public static void main(String[] args) {
        int arr1 [][] = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            
        };
        
        // int[][]arr2 = {
        //     {1,2,3,4},
        //     {5,6,7,8},
        //     {9,10,11,12},
        //     {13,14,15,16}
        // };

        System.out.println(Arrays.toString(binSearch2d_1(arr1, 49)));
    }

    static int[] binSearch2d_1(int[][]arr,int target)
    {
        int row = 0;
        int col = arr[0].length - 1;

        while(row < arr.length && col>=0)
        {
            if(arr[row][col] == target)
            {
                return new int[]{row,col};
            }
            if(target > arr[row][col])
            {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
    
    static int[] binSearch2d_2(int[][]arr,int target)
    {
            // {1,2,3,4},
            // {5,6,7,8},
            // {9,10,11,12},
            // {13,14,15,16}

            int row = 0;
            int col = arr.length-1;
            while(row<arr.length && col>=0)
            {
                if(arr[row][col] == target)
                {
                    return new int[]{row,col};
                }
                else if(target > arr[row][col])
                {
                    row++;
                }
                else
                {
                    col--;
                }
            }
            return new int[]{-1,-1};
    }
}
