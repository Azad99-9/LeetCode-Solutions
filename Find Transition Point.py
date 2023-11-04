class Solution:
    def transitionPoint(self, arr, n): 
        l = 0
        h = n-1
        ans = -1
        
        while (l <= h):
            mid = l + (h - l) // 2

            if arr[mid] == 1:
                ans = mid
                h = mid - 1
            else:
                l = mid + 1
                
        return ans


