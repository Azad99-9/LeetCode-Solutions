class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        diffs=[]
        for i in range(1, len(nums)):
            diffs.append((nums[i] - nums[i-1]))

        l = 0
        r = 1
        n = len(diffs)
        ans = 0
        while r < n:
            if diffs[r] == diffs[r-1]: r+=1
            else:
                if r-l+1 > 2:
                    print(diffs[l:r])
                    x = r-l+1
                    x -= 2
                    x = (x * (x+1)) / 2
                    ans += x
                
                l = r
                r += 1
        if r-l+1 > 2:
            x = r-l+1
            x -= 2
            x = (x * (x+1)) / 2
            ans += x
        return ans