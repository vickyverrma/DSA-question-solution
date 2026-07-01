class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int low = 0;
        int sum = 0;
        for(int high = 0; high<nums.length; high++)
        {
            sum += nums[high];
            while(sum>=target)
            {
                result = Math.min(result , (high-low+1));
                sum -= nums[low];
                low++;
            }
        }
        return (result == Integer.MAX_VALUE) ? 0 : result;
    }
}