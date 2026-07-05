class Solution {
    public int maximumSum(int[] arr) {
        int onedelete = Integer.MIN_VALUE;
        int nodelete = arr[0];
        int res = arr[0];
        for(int i = 1; i<arr.length; i++)
        {
            int prevnodelete = nodelete;
            int prevonedelete = onedelete;
            nodelete = Math.max(arr[i],nodelete+arr[i]);
            if(prevonedelete == Integer.MIN_VALUE )
            {
                prevonedelete = arr[i];
            }
            else {
                prevonedelete = prevonedelete + arr[i];
            }
            onedelete = Math.max(prevonedelete , prevnodelete);
            res = Math.max(res,Math.max(onedelete,nodelete));
        }
        return res;
        
    }
}