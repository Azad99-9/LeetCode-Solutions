class Solution(object):
    def numTrees(self, n):
        dp = {1:1}
        for i in range(2, n+1):
            ans = 0
            for j in range(1, i+1):
                left = abs(j-1) if abs(j-1) > 0 else 1
                right = abs(i-j) if abs(i-j) > 0 else 1
                ans += dp[left] * dp[right]
            dp[i] = ans
        return dp[n]