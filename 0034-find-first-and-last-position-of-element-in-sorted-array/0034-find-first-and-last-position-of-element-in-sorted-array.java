class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fo = firstocr(nums,target);
        if(fo == -1){
            return new int[]{fo,-1};
        }
        int lo = lastocr(nums,target);
        return new int[]{fo,lo};
    }
    static int firstocr(int [] nums, int target)
    {
        int fo = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid = (low + high)/2;
            if(nums[mid] == target)
            {
                fo = mid;
                high = mid - 1;
            }
            else if(nums[mid]>target)
            {
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
            
        }
        return fo;

    }
    static int lastocr(int [] nums, int target)
    {
        int lo = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid]==target)
            {
                lo = mid;
                low = mid +1;
            }
            else if(nums[mid]>target)
            {
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return lo;
    }
}