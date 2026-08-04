class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        // kadane's algo if sum went below the zero initialize the sum again from the zero
        for(int i = 0; i<nums.length; i++)
        {
            sum = sum+nums[i];
            if(sum>max)
            {
                max = sum;
            }
            if(sum<0)
            {
                sum = 0;
            }
        }
        return max;
    }
}