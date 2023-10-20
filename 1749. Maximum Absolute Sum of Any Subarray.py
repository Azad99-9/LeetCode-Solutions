class Solution(object):
    def maxAbsoluteSum(self, nums):
        n = len(nums)
        pre = 0

        maxi = 0
        mini = 0

        ans = 0

        for i in range(n):
            pre = pre + nums[i]
            negSum = pre - maxi
            posSum = pre - mini
            ans = max(ans, max(abs(negSum), abs(posSum)))
            mini = min(mini, pre)
            maxi = max(maxi, pre)

        return ans
        