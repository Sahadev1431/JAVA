package InsertSort;

import java.util.Arrays;

public class insearSort{
    public static void main(String[] args) {
        int [] arr = {4,8,3,1,6,4,9,2,4,5,4};
        System.out.println("before");
        System.out.println(Arrays.toString(arr));
        inser(arr);
        System.out.println("after");
        System.out.println(Arrays.toString(arr));
    }
    static void inser(int[]arr)
    {
        for (int i = 0; i < arr.length -1; i++ )
        {
            for(int j = i+1; j > 0; j-- )
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
    }
}