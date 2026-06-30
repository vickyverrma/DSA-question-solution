class Solution {
    public void sortColors(int[] nums) {
        int middle = 0;
        int low = 0;
        int high = nums.length-1;
        while(middle<=high)
        {
            if(nums[middle]==0)
            {
                int temp = nums[middle];
                nums[middle] = nums[low];
                nums[low] = temp;
                low++;
                middle++;
            }
            else if(nums[middle]==1)
            {
                middle++;
            }
            else
            {
                int temp2 = nums[middle];
                nums[middle] = nums[high];
                nums[high] = temp2;
                high--;
            }
        }

    }
}