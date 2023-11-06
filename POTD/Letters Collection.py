class Solution:
    
    
    def matrixSum(self, n, m, mat, q, queries):
        def one_hop(i, j, n, m,mat, h):
            ans = 0
            
            dx = [-1, -1, -1, 0, 0, 1, 1, 1] if h == 1 else [-2, -2, -2, -2, -2,
            -1, -1,
            0, 0,
            1, 1,
            2, 2, 2, 2, 2]
            
            dy = [-1, 0, 1, -1, 1, -1, 0, 1] if h == 1 else [-2, -1, 0, 1, 2,
            -2, 2,
            -2, 2,
            -2, 2,
            -2, -1, 0, 1, 2
            ]
            
            for l in range(len(dx)):
                nx = i + dx[l]
                ny = j + dy[l]
                if nx > -1 and nx < n and ny > -1 and ny < m:
                    # print(nx, ny)
                    ans += mat[nx][ny]
                    
            # print()
            return ans
        # code here
        ans = []
        
        for query in queries:
            op, i, j = query[0], query[1], query[2]
            
            ans.append(one_hop(i, j, n, m, mat, op))
            
        return ans
