class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.get(triangle.size() - 1).size();
        int[][] dp = new int[n][n];
        for (int j = 0; j < n; j++) dp[n-1][j] = triangle.get(n - 1).get(j);
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                int d = triangle.get(i).get(j) + dp[i+1][j];
                int dg = triangle.get(i).get(j) + dp[i+1][j + 1];
                dp[i][j] = Math.min(d, dg);
            }
        }
        return dp[0][0];
    }
}
