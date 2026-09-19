class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer>freq = new HashMap<>();
        int count = 0;
        int req = 0;
        for(int i = 0; i<nums.length; i++)
        {
            int curr = nums[i];
            freq.put(curr,freq.getOrDefault(curr,0)+1);
            if(freq.get(curr)==2)
            {
                count = curr;
            }
        }
        for(int i = 0; i<nums.length; i++)
        {
            if(freq.containsKey(i+1))
            {
                continue;
            }
            else{
                req = i+1;
            }
        }
        return new int[]{count,req};

    }
}