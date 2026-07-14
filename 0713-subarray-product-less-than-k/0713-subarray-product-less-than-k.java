class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        if(k==0)
        {
            return 0;
        }
        int mul = 1;
        int low = 0;
        for(int high = 0; high<nums.length; high++)
        {
            mul   = mul*nums[high];
            while(mul>=k && low<=high)
            {
                mul = mul/nums[low];
                low++;
            }
            count = count+(high-low+1);

        }
        return count;
    }
}