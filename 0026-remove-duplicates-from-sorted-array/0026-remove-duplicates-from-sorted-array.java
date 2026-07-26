class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        for(int right = 1; right<nums.length; right++)
        {
            if(nums[right-1]==nums[right])
            {
                continue;
            }
            else
            {
                nums[left+1]=nums[right];
                left++;
            }
        }
        return left+1;
    }
}