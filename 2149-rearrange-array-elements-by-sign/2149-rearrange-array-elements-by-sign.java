class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] res = new int[nums.length];
        int pos = 0, neg = 1;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]<0)
            {
                res[neg]=nums[i];
                neg = neg+2;
            }
            else {
                res[pos]=nums[i];
                pos = pos+2;
            }
        }
        return res;
    }
}