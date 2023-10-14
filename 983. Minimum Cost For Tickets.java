class Solution(object):
    def mincostTickets(self, days, costs):
        
        def recur(i, curLim, cost, day, dp):
            if i == len(day):
                return 0

            tup = (i, curLim)
            if tup in dp: return dp[tup]

            oneday = 0
            sevday = 0
            thirtyday = 0

            ans = 0
            if curLim <= days[i]:
                oneday = cost[0] + recur(i+1, days[i]+1, cost, day, dp)
                sevday = cost[1] + recur(i+1, days[i]+7, cost, day, dp)
                thirtyday = cost[2] + recur(i+1, days[i]+30, cost, day, dp)
                ans = min(oneday, sevday, thirtyday)
            else:
                ans = recur(i+1, curLim, cost, day, dp)

            dp[tup] = ans
            return ans
        
        dp = {}
        return recur(0, 0, costs, days, dp)
        