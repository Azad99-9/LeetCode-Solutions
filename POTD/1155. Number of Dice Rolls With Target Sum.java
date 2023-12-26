class Solution {
    int mod = (int)1e9 + 7;
    private int f (int die, int cs, int k, int n, int t, int[][] dp) {
        if (cs > t) return 0;

        if (die == n) {
            if (cs == t) {
                return 1;
            }
            return 0;
        }

        if (dp[die][cs] != -1) return dp[die][cs];

        long ways = 0;

        for (int curFace = 1; curFace <= k; curFace++) {
            ways += f (die + 1, cs + curFace, k, n, t, dp);
        }

        return dp[die][cs] = (int)(ways%mod);
    }
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n+1][target + 1];

        for (int i = 0; i < n; i++) Arrays.fill(dp[i], -1);

        dp[n][target] = 1;

        for (int die = n-1; die > -1; die--) {
            for (int cs = 0; cs <= target; cs++) {
                long ways = 0;
                for (int curFace = 1; curFace <= k; curFace++) {
                    if (cs + curFace <= target) {
                        ways += dp[die + 1][cs + curFace];
                    }
                }
                dp[die][cs] = (int)(ways % mod);
            }            
        }

        return dp[0][0];
    }
}
