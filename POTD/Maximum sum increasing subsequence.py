class Solution:
    
    
	def maxSumIS(self, Arr, n):
	
        dp = [0] * n
        
        for i in range(n):
            dp[i] = Arr[i]
            for j in range(i):
                if Arr[i] > Arr[j]:
                    dp[i] = max(dp[i], Arr[i] + dp[j])
        
        return max(dp)