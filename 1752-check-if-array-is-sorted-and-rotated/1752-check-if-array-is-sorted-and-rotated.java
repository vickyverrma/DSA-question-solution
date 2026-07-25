class Solution {
    public boolean check(int[] nums) {
        int count = 1;
        int N = nums.length;
        if(N==1)return true;
        for(int i = 1; i<2*N; i++)
        {
            if(nums[(i-1)%N]<=nums[i%N])
            {
                count++;
            }
            else
            {
                count = 1;
            }
            if(count == N)
            return true;

        }
        return false;
    }
}