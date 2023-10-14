class Solution(object):
    def waysToMakeFair(self, nums):
        
        def check(od, ev, i, n):
            odd = 0
            even = 0
            if i-1 >= 0: odd += od[i-1]
            if i-1 >= 0: even += ev[i-1]

            neven = (od[n-1] - od[i]) + even
            nodd = (ev[n-1] - ev[i]) + odd

            return neven == nodd

        n = len(nums)
        oddArr = []
        evenArr = []
        pree = 0
        preo = 0
        for i in range(len(nums)):
            if i % 2 == 0:
                evenArr.append(pree + nums[i])
                oddArr.append(preo)
                pree = evenArr[i]
            else:
                oddArr.append(preo + nums[i])
                evenArr.append(pree)
                preo = oddArr[i]

        ans = 0
        for i in range(len(nums)):
            if (check(oddArr, evenArr, i, n)):
                ans += 1

        return ans