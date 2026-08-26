class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0;
        int ele1 = Integer.MIN_VALUE,ele2 = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++)
        {
            if(cnt1==0 && ele2 != nums[i])
            {
                cnt1 = 1;
                ele1 = nums[i];
            }
            else if(cnt2 == 0 && ele1 != nums[i])
            {
                cnt2 = 1;
                ele2 = nums[i];
            }
            else if(nums[i]== ele1) cnt1++;
            else if(nums[i] == ele2) cnt2++;
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(ele1==nums[i]) cnt1++;
            if(ele2==nums[i]) cnt2++;
        }
        int min = nums.length/3;
        List<Integer> res = new ArrayList<>();
        if(cnt1>min) res.add(ele1);
        if(cnt2>min) res.add(ele2);
        return res;

    }
}