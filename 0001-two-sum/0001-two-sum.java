class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> fill = new HashMap<>();
        for(int i = 0; i<nums.length; i++)
        {
            int comp = target-nums[i];
            if(fill.containsKey(comp))
            {
                int s1 = fill.get(comp);
                return new int[]{s1,i};
            }
            else {
                fill.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}