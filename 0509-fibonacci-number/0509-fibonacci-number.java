class Solution {
    public int fib(int n) {
        // by memoization
        int [] dp1 = new int[n+1];
        Arrays.fill(dp1,-1);
        return fibo(n,dp1);

    }
    int fibo(int n, int[]dp1)
    {
        if(n<=1) return n;
        if(dp1[n]!= -1) return dp1[n];
        dp1[n] = fibo(n-1,dp1)+fibo(n-2,dp1);
        return dp1[n];
    }
}