class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        Arrays.sort(nums);
        int count = 1;
        int current = 1;
        for(int i = 1;i<n; i++)
        {
            if(nums[i]==nums[i-1]+1)
            {
               current++;
            }
            else if(nums[i]==nums[i-1])
            {
                continue;
            }
            else{
                current = 1;
            }
            count = Math.max(current,count);
        }
        return count;
    }
}