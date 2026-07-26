class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        int left = -1;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]==0)
            {
                left = i;
                break;
            }

        }
        if(left==-1) return;
        for(int i = left+1; i<nums.length; i++)
        {
            if(nums[i]!=0)
            {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}