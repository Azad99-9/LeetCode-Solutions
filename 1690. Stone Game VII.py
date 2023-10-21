class Solution(object):
    
    def stoneGameVII(self, stones):
        """
        :type stones: List[int]
        :rtype: int
        """

        def recur(i, j, sum, stones, dp):
            if i == j: return 0

            if (i,j) in dp: return dp[(i, j)]
            dp[(i, j)] = max((sum - stones[i]) - recur(i+1, j, sum-stones[i], stones, dp), (sum - stones[j]) - recur(i, j-1, sum-stones[j], stones, dp))
            return dp[(i, j)]
        sumi = sum(stones)
        dp = {}
        return recur(0, len(stones) - 1, sumi, stones, dp)