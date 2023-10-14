class Solution(object):
    def change(self, amount, coins):
        
        def recur(i, coins, cs, amount, n, dp):
            if cs == amount: return 1

            if cs > amount: return 0

            if i == n: return 0

            tup = (i, cs)
            if tup in dp: return dp[tup]

            take = recur(i, coins, cs + coins[i], amount, n, dp)
            ntake = recur(i+1, coins, cs, amount, n, dp)

            dp[tup] = take + ntake
            return take + ntake

        dp = {}
        return recur(0, coins, 0, amount, len(coins), dp)
        