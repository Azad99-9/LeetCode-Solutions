class Solution(object):
    def integerBreak(self, n):
        
        def recur(n, dp):
            if n <= 1: return 1
        
            if n in dp: return dp[n]

            maxi = 0
            for i in range(1, n+1):
                maxi = max(maxi, i*recur(n-i, dp))
            
            dp[n] = maxi
            return dp[n]

        dp = {}
        if n == 2: return 1
        if n == 3: return 2
        ans = recur(n, dp)
        return ans
        