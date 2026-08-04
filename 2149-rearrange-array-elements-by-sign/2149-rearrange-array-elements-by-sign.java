class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positive = new int[nums.length/2];
        int[] negative = new int[nums.length/2];
        int positiveind = 0;
        int negativeind = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]<0)
            {
                negative[negativeind]=nums[i];
                negativeind++;
            }
            else
            {
                positive[positiveind]=nums[i];
                positiveind++;
            }
        }
        int index = 0;
        for(int i = 0; i<nums.length/2;i++)
        {
            nums[index]=positive[i];
            index++;
            nums[index]=negative[i];
            index++;

        }
        return nums;
        
    }
}