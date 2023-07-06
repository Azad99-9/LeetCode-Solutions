
class Solution {
    public static int recur(int i, int buy, int profit, int[] values, int[][] dp) {
        if (i == values.length) return 0;

        if (dp[i][buy] != -1) return dp[i][buy];
        if (buy == 1) {
            profit = Math.max(-values[i] + recur(i+1, 0, profit, values, dp), recur(i+1, 1, profit, values, dp));
        } else {
            profit = Math.max(values[i] + recur(i+1, 1, profit, values, dp), recur(i+1, 0, profit, values, dp));
        }
        return dp[i][buy] = profit;
    }
    public static int stockBuyAndSell(int n, int[] prices) {
        int[][] dp = new int[n+1][2];
        for(int i = 0; i < n; i++) Arrays.fill(dp[i], -1);
        return recur(0, 1, 0, prices, dp);
    }
}
        
