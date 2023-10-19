class Solution(object):
    def maxSumTwoNoOverlap(self, nums, firstLen, secondLen):
        def createPresum(nums, k):
            preSum = [-1]*len(nums)
            cs = 0
            for i in range(k):
                cs += nums[i]
            l = 0
            r = k
            preSum[r-1] = cs
            while (r < len(nums)):
                cs -= nums[l]
                cs += nums[r]
                preSum[r] = cs
                l+= 1
                r+= 1
            return preSum

        def preMax(nums):
            for i in range(1, len(nums)):
                nums[i] = max(nums[i-1], nums[i])
            return nums
        
        n = len(nums)
        first_len_pre = createPresum(nums, firstLen)
        sec_pre_max = createPresum(nums, secondLen)
        sec_pre_max = preMax(sec_pre_max)

        k = secondLen
        sec_post_max = [-1]*len(nums)
        cs = 0
        for i in range(n-1, n-k-1, -1):
            cs += nums[i]
        l = n-k-1
        r = n-1
        sec_post_max[l+1] = cs
        while (l > -1):
            cs -= nums[r]
            cs += nums[l]
            sec_post_max[l] = cs
            r-= 1
            l-= 1
        for i in range(n-2, -1, -1):
            sec_post_max[i] = max(sec_post_max[i], sec_post_max[i+1])

        ans = 0
        for i in range(n):
            preSum = first_len_pre[i]
            preMax = sec_pre_max[i-firstLen] if i - firstLen > -1 else 0
            postMax = sec_post_max[i+1] if i + 1 < n else 0
            ans = max(ans, preSum + max(preMax, postMax))

        return ans
        


