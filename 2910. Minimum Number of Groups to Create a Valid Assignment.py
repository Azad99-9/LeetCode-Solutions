class Solution(object):
    def minGroupsForValidAssignment(self, nums):
        n = len(nums)
        
        mp = {}
        for num in nums:
            if num in mp: mp[num] += 1
            else: mp[num] = 1
                
        freq = []
        for key, val in mp.items():
            freq.append(val)
            
        mini = min(freq)
        
        ans = 10**9
        for i in range(1, mini+1):
            a = i
            b = i+1
            num = 0
            bad = False
            for f in freq:
                cur = f
                mn = 10**9
                cnt = 0
                while cur >= 0:
                    if cur % a == 0: mn = cnt + cur // a
                    cur -= b
                    cnt+= 1
                if mn == 10**9:
                    bad = True
                    break
                num += mn
            if not bad: ans = min(ans, num)
            
        return ans
                
        