class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int n = intervals.length;
        List<int[]> ans =  new ArrayList<>();
        int i = 0;
        while(i<n)
        {
            int start = intervals[i][0];
            int end = intervals[i][1];
            int j = i+1;
            while(j<n && intervals[j][0]<=end)
            {
                end = Math.max(end , intervals[j][1]);
                j++;
            }
            ans.add(new int[]{start,end});
            i=j;
        }
    return ans.toArray(new int[ans.size()][]);
    }
}