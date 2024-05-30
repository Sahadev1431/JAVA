public class AgnosticBinarySearch {
    public static void main(String[] args) {
        // int []arr = {2,4,6,8,10,12,14,16};
        // System.out.println(orderAgnosticBinarySearch(arr, 14, 0, arr.length-1));

        // int[] arr = {14,12,10,8,6,4,2};
        // System.out.println(orderAgnosticBinarySearch(arr, 4, 0, arr.length-1));
    }

    static int orderAgnosticBinarySearch(int[]MountainArray,int target,int start,int end)  // we can remove start and end from here and give value of start = 0 and end = arr.length -1 inside method but here I have copied this and I have done this type of sol to solve a ques
    {
        if(MountainArray[start]<MountainArray[end])
        {
            while(start <=end)
            {
                int mid = start +(end - start) / 2;
                if(target < MountainArray[mid])
                {
                    end = mid - 1;
                }
                else if (target > MountainArray[mid])
                {
                    start = mid+1;
                }
                else
                {
                    return mid;
                }
            }
        }
        else
        {
            while(start <=end)
            {
                // int[] MountainArray = {16,14,12,10,8,6,4,2};   
                int mid = start +(end - start) / 2;
                if(target > MountainArray[mid])
                {
                    end = mid - 1;
                }
                else if (target < MountainArray[mid])
                {
                    start = mid+1;
                }
                else
                {
                    return mid;
                }
            }
        }
        return -1;
    }
}
