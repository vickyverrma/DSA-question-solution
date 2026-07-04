class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxArea = 0;
        while(i<j)
        {
            int area = 1;
            int min = Math.min(height[i], height[j]);
            int width = j-i;
            area = min*width;
            maxArea = Math.max(maxArea,area);
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return maxArea;
    }
}