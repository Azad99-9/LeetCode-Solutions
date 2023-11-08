class Solution:
    
    #Function to return list of integers visited in snake pattern in matrix.
    def snakePattern(self, matrix): 
        n = len(matrix)
       
        ans = []
        for i in range(n):
            if i & 1:
                for j in range(n-1, -1, -1):
                   ans.append(matrix[i][j])
            else:
                for j in range(n):
                    ans.append(matrix[i][j])
                   
        return ans

