class Solution:
    def sumOfDivisors(self, N):
        n = N
        sum = 0
        for i in range(1, n + 1):
            sum += (n // i) * i
        return (sum)
