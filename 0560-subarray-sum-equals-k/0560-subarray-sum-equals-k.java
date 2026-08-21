class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> res = new HashMap<>();
        res.put(0,1);
        int sum = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++)
        {
            sum += nums[i];
            int req_val = sum - k;
            if(res.containsKey(req_val))
            {
                count = count + res.get(req_val);
            }
            res.put(sum,res.getOrDefault(sum,0)+1);

        }
        return count;
    }
}