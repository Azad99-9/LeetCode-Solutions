from typing import List

class Solution:
    def largestIsland(self, grid : List[List[int]]) -> int:
        
        def dfs(i, j, key, keys, n, m):
            if i < 0 or j < 0 or i >= n or j >= m or keys[i][j] != -1 or grid[i][j] == 0:
                return 0
                
            keys[i][j] = key
            length = 1
            
            dx = [0, 0, 1, -1]
            dy = [1, -1, 0, 0]
            
            for k in range(4):
                nx = i + dx[k]
                ny = j + dy[k]
                length += dfs(nx, ny, key, keys, n, m)
            
            return length
            
            
        length = 0
        lengths = {}
        key = 2
        n = len(grid)
        m = len(grid[0])
        keys = [[-1 for _ in range(n)] for _ in range(m)]
        
        for i in range(n):
            for j in range(m):
                length = dfs(i, j, key, keys, n, m)
                if length != 0:
                    lengths[key] = length
                    key += 1
        

        length = 0
        dx = [0, 0, 1, -1]
        dy = [1, -1, 0, 0]
        for i in range(n):
            for j in range(m):
                if grid[i][j] == 1:
                    length = max(length, lengths[keys[i][j]])
                else:
                    up = keys[i-1][j] if i-1 > -1 else 0
                    down = keys[i+1][j] if i+1 < n else 0
                    left = keys[i][j-1] if j-1 > -1 else 0
                    right = keys[i][j+1] if j+1 < m else 0
                    
                    curls = set([up, down, right, left])
                    le = 1
                    
                    for l in curls:
                        if l > 1 : le += lengths[l]
                    length = max(length, le)
                    
        return length
