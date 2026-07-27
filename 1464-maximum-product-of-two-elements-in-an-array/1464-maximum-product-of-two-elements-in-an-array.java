class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int secondMax = 0;

        for (int num : nums) {
            if (num > max) {
                // Old max becomes second max
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                // If it's not bigger than max, check if it beats second max
                secondMax = num;
            }
        }

        // Return the required formula
        return (max - 1) * (secondMax - 1);
    }
}