class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int low = 0;
        int high = 0;

        while (low < nums1.length && high < nums2.length) {

            if (nums1[low] == nums2[high]) {

                if (ans.isEmpty() || ans.get(ans.size() - 1) != nums1[low]) {
                    ans.add(nums1[low]);
                }

                low++;
                high++;
            }
            else if (nums1[low] < nums2[high]) {
                low++;
            }
            else {
                high++;
            }
        }

        int[] res = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }
}