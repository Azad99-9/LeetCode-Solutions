import sys

class Solution(object):
    def minFlipsMonoIncr(self, s):
        

        def recur(i, n, s, poss, dp):
            if i == n: return 0

            cur = s[i]

            tup = (i, poss)
            if tup in dp: return dp[tup]

            left = sys.maxsize
            flip = sys.maxsize
            if cur == "0":
                if poss:
                    left = recur(i+1, n, s, True, dp)
                flip = 1 + recur(i+1, n, s, False, dp)

            if cur == "1":
                left = recur(i+1, n, s, False, dp)
                if poss:
                    flip = 1 + recur(i+1, n, s, True, dp)

            dp[tup] = min(left, flip)
            return dp[tup]
        
        dp = {}
        return recur(0, len(s), s, True, dp)