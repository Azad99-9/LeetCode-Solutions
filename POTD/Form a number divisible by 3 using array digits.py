class Solution:
    def isPossible(self, N, arr):
        ans = 0
        for num in arr:
            while num != 0:
                ans += num % 10
                num = num // 10
                
        return 1 if ans%3 == 0 else 0
