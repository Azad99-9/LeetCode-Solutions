class Solution {
    // s - O( n )
    // T - o( n )
    public int helper (int n, int[] dp) {
        if (dp[n] != -1) return dp[n];
        if (n < 2) return n;
        return dp[n] = helper (n - 1, dp) + helper (n - 2, dp);
    }
    public int fib(int n) {
        int[] dp = new int [n + 1];
        for(int i = 0; i < dp.length; i++) dp[i] = -1;
        return helper (n , dp);
    }
}
