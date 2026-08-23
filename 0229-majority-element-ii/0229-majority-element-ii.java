class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>res = new ArrayList<>();
        int req = nums.length/3;
        for(Integer key :map.keySet())
        {
            if(map.get(key)>req)
            {
                res.add(key);
            }
        }
        return res;
    }
}