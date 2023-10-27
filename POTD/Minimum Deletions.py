class Solution:
    
    def minimumNumberOfDeletions(self,S):
        def recur(i, j, n, s, s_rev, dp):
            if i >= n or j >= n: return 0
            
            tup = (i,j)
            if tup in dp: return dp[tup]
            
            a = 0
            if s[i] == s_rev[j]:
                a = 1 + recur(i+1, j+1, n, s, s_rev, dp)
            
            b = max(recur(i+1, j, n, s, s_rev, dp), recur(i, j+1, n, s, s_rev, dp))
            
            dp[tup] = max(a,b)
            return dp[tup]
            
        # dp = {}
        # lcs_len = recur(0, 0, len(S), S, S[::-1], dp)
        
        n = len(S)
        s_rev = S[::-1]
        nex = [0]*(n+1)
        cur = [0]*(n+1)
        # dp = [[0]*(n+1) for _ in range(n+1)]
        
        for i in range(n-1, -1, -1):
            for j in range(n-1, -1, -1):
                a = 0
                if S[i] == s_rev[j]:
                    a = 1 + nex[j+1]
                
                b = max(nex[j], cur[j+1])
                
                cur[j] = max(a, b)
                
            nex = cur.copy()

        return len(S) - nex[0]
        