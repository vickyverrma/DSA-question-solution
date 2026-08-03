class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int n = nums.length-1;
        for(int i = 0; i<=n; i++)
        {
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        int res = Integer.MIN_VALUE;
        for(int key: freq.keySet())
        {
            if(freq.get(key)>n/2)
            {
                res = key;
            }
        }
        return res;
    }
}