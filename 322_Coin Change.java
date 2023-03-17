class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] prev = new int[amount + 1];
        int[] cur = new int[amount + 1];

        for (int T = 0; T <= amount; T++) {
            prev[T] = T % coins[0] == 0 ? (int)T/coins[0] : (int)1e9;
        }

        for (int ind = 1; ind < coins.length; ind++) {
            for (int T = 0; T <= amount; T++) {
                int notTake = prev[T];
                int take = (int)1e9;
                if (coins[ind] <= T) take = 1 + cur[T - coins[ind]];
                cur[T] = Math.min(take , notTake);
            }
            prev = cur;
        }
        
        int ans = prev[amount];
        if (ans >= 1e9) return -1;
        else return ans;
    }
}
