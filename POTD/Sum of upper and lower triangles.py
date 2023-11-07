class Solution:
    
    #Function to return sum of upper and lower triangles of a matrix.
    def sumTriangles(self,matrix, n):
        up = 0
        low = 0
        for i in range(n):
            for j in range(n):
                if i == j:
                    up += matrix[i][j]
                    low += matrix[i][j]
                elif i < j:
                    low += matrix[i][j]
                else:
                    up += matrix[i][j]
                    
        return [low, up]

