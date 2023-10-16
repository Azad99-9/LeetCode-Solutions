class Solution(object):
    def constructProductMatrix(self, grid):
        nums = []
        n = len(grid)
        m = len(grid[0])
        mod = 12345
        for i in range(n):
            for j in grid[i]:
                nums.append(j)
                
        prefix = [1]*(n*m)
        prefix[0] = nums[0]
        for i in range(1,len(nums)):
            prefix[i] = prefix[i-1]*nums[i]
            prefix[i] = prefix[i] % mod
            
        suffix = [1]*(n*m)
        suffix[n*m - 1] = nums[n*m - 1]
        for i in range(n*m - 2, -1, -1):
            suffix[i] = suffix[i+1]*nums[i]
            suffix[i] = suffix[i] %  mod
            
        # print(nums, prefix, suffix)
            
        l = n*m -1
        ans = [[1 for _ in range(m)] for _ in range(n)]
        k = 0
        for i in range(n):
            for j in range(m):
                pre = prefix[k-1] if k-1 >= 0 else 1
                suf = suffix[k+1] if k+1 <= l else 1
                
                k+= 1
                a = pre * suf
                a = a % mod
                
                ans[i][j] = a
        return ans
            
        
        














