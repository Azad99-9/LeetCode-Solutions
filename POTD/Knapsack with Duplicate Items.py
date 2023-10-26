
class Solution:
    def knapSack(self, N, W, val, wt):
        dp = [0] * (W + 1)

        for w in range(1, W + 1):
            for i in range(N):
                if wt[i] <= w:
                    dp[w] = max(dp[w], dp[w - wt[i]] + val[i])
    
        return dp[W]