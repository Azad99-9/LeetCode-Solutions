class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] endPoints = new int[m][n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            endPoints[0][i] = matrix[0][i];
            ans += matrix[0][i];
        }
        for (int i = 1; i < m; i++) {
            endPoints[i][0] = matrix[i][0];
            ans += matrix[i][0];
        }
        

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != 0) {
                    endPoints[i][j] = Math.min(
                    endPoints[i-1][j],
                    Math.min(
                        endPoints[i-1][j-1],
                        endPoints[i][j-1]
                    )
                    ) + 1;
                    ans += endPoints[i][j];
                    
                }
            }
        }

        return ans;
    }
}