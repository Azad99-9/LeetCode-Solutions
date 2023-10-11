class Solution {
    private int recursion(int i, int[] arr, int n, int k, int prev, int[][] dp) {
        if (i == n) return 0;

        if (dp[i][prev] != -1) return dp[i][prev];
        int max = arr[i], ans = 0;

        for (int j = i; j < i+k && j < n; j++) {
            max = Math.max(arr[j], max);
            int nextPart = recursion(j+1, arr, n, k, i, dp);
            ans = Math.max(ans, nextPart + (max * (j - i + 1)));
        }

        return dp[i][prev] = ans;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[][] = new int[arr.length][arr.length];
        for (int i = 0; i < dp.length; i++) Arrays.fill(dp[i], -1);
        return recursion(0, arr, arr.length, k, 0, dp);
    }
}