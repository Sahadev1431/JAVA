package selectionSort;

import java.util.Arrays;

public class SeleSort {
    public static void main(String[] args) {
        int [] arr = {0,-5,5,8,-65,12,5};
        System.out.println("before");
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println("after");
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr)
    {
        for (int i = 0; i < arr.length; i++ )
        {
            int lastInd = arr.length -i -1;
            int maxInd = getMax(arr,0,lastInd);

            int temp = arr[lastInd];
            arr[lastInd] = arr[maxInd];
            arr[maxInd] = temp;
        }
    }
    static int getMax(int[]arr,int start,int end)
    {
        int max = start;
        for (int i = 0; i <=end; i++) 
        {
            if(arr[max] < arr[i])
            {
                max = i;
            }
        }
        return max;
    }
}


