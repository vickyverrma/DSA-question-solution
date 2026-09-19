class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int sum = nums[0];
        int n = nums.length;
        int temp = 0;
        for(int i = 1; i<n; i++)
        {
            if(nums[i]==nums[i-1])
            {
                temp = nums[i];
            }
            sum = sum + nums[i];
        }
        int total = n * (n+1)/2;
        int req =  Math.abs(sum-temp);
        int reqf = total - req;
        return new int[]{temp,reqf};
    }
}