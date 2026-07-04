class Solution {
    public int[] searchRange(int[] nums, int target) {
        // for first occurance
        int fr = -1;
        int fl = -1;
        int low = 0;
        int high = nums.length-1;

        while(low<=high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid]==target)
            {
                fr = mid;
                high = mid-1;
            }
            else if(nums[mid]<target)
            {
                low = mid+1;
            }
            else 
            {
                high = mid-1;
            }
        }
        low = 0;
        high = nums.length-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid]==target)
            {
                fl = mid;
                low = mid+1;
            }
            else if(nums[mid]<target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return new int []{fr,fl};
    }
}