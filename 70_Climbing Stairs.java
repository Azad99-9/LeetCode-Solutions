class Solution {
    public int helper (int n, int[] arr) {
        // T - O ( N )
        // S - O ( N )
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (arr[n] != -1) return arr[n];
        int left = helper (n - 1, arr);
        int right = helper (n - 2, arr);
        return arr[n] = left + right;
    }
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i < n + 1; i++) dp[i] = -1;
        return helper (n, dp);
    }
}
