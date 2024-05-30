// import java.util.Arrays;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] newArr = new int[2];
        int num1 = 0;
        int sum = 0;
        for (int i = 0 ;i<nums.length;i++)
        {
            num1 = nums[i];
            for (int j = 0;j<nums.length;j++)
            {
                sum = nums[i]+nums[j];
                if(sum == target)
                {
                    newArr[0] = i;
                    newArr[1] = j;
                }
            }
            
        }
        return newArr;
    }

    public static void main(String[] args) {
        int [] arr = new int[4];
        int target = 9;
        
        System.out.println(twoSum(arr, target));
    }
}