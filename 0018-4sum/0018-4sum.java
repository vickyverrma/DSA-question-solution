class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length-3; i++) //why n<-3 because we have to find quadruplets
        {
            if(i > 0 && nums[i] == nums[i-1]) continue; // for skipping the duplicates
            for(int j = i+1; j < nums.length-2; j++)
            {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int low = j+1;
                int high = nums.length-1;
                while(low<high)
                {
                    long sum = (long) nums[i] + nums[j] + nums[low] + nums[high];
                    if(sum == target)
                    {
                        result.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        low++;
                        high--;
                        while(low < high && nums[low] == nums[low-1]) low++;
                        while(low < high && nums[high] == nums[high+1]) high--;
                    }
                    else if(sum > target)
                    {
                        high--;
                    }
                    else 
                    {
                        low++;
                    }
                }
            }
        }
        return result;
    }
}