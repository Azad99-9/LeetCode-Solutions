class Solution:
    def minOperation(self, n):
        # dp = [0]*(n+1)
        # dp[1] = 1
        
        # for i in range(2, n+1):
        #     if i % 2 == 0:
        #         dp[i] = 1 + min(dp[i-1], dp[i//2])
        #     else:
        #         dp[i] = 1 + dp[i-1]
                
        # return dp[n]
        
        def recur(n):
            if n == 1: return 1
            
            if n % 2 == 0: return 1 + recur(n//2)
            
            return 1 + recur(n-1)
            
        return recur(n)