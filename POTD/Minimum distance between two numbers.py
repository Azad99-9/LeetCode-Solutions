class Solution:
    def minDist(self, arr, n, x, y):
        l = 0
        r = 0
        f = -1
        mini = float('inf')
        while (r < n):
            cur = arr[r]
            if cur == x or cur == y:
                if cur != f and f != -1:
                    mini = min(mini, r-l)
                l = r
                f = arr[l]
            r += 1
        if mini == float('inf'): return -1
        return mini
    

