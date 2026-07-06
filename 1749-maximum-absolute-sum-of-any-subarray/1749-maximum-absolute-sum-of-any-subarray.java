class Solution {
    public int maxAbsoluteSum(int[] nums) {
        return Math.max(maxsum(nums),minsum(nums));
    }
    int maxsum(int[] nums)
    {
        int bestending = nums[0];
        int ans = nums[0];
        for(int i = 1; i<nums.length; i++)
        {
            int v1 = bestending + nums[i];
            int v2 = nums[i];
            bestending = Math.max(v1,v2);
            ans = Math.max(ans,bestending);
        }
        return Math.abs(ans);
    }

    int minsum(int[] nums)
    {
        int bestending = nums[0];
        int ans = nums[0];
        for(int i = 1; i<nums.length; i++)
        {
            int v1 = bestending + nums[i];
            int v2 = nums[i];
            bestending = Math.min(v1,v2);
            ans = Math.min(ans,bestending);
        }
        return Math.abs(ans);
    }
}