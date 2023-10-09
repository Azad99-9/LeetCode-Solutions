class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        int[] dp = new int[n+1];
        for (int i = 0; i <= n; i++) {
            int lastBit = i & 1;
            int iby2ones = dp[i/2];
            dp[i] = lastBit + iby2ones;
            ans[i] = dp[i];
        }

        return ans;
    }
}