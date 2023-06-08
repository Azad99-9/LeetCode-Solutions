import java.util.* ;
import java.io.*; 



public class Solution {
    public static int recur (int[][] matrix, int m, int n, int i, int j, int[][] dp) {
        if (i < 0 || j < 0 || i >= m || j >= n) return (int)Math.pow(-10,9);
        
        if (i == m-1) return matrix[i][j];
        
        if (dp[i][j] != -1) return dp[i][j];
        int leftDiagonal = matrix[i][j] + recur(matrix, m, n, i+1, j-1, dp);
        int bottom = matrix[i][j] + recur(matrix, m, n, i+1, j, dp);
        int rightDiagonal = matrix[i][j] + recur(matrix, m, n, i+1, j+1, dp);

        dp[i][j] = Math.max(leftDiagonal, Math.max(bottom, rightDiagonal));
        return dp[i][j];
    }
	public static int getMaxPathSum(int[][] matrix) {
		int m = matrix.length;
        int n = matrix[0].length;
        int max = Integer.MIN_VALUE;
        
        // for (int j = 0; j < n; j++) {
        //     max = Math.max(max, recur(matrix, m, n, 0, j));
        // }
        // return max;

        // int[][] memoize = new int[m][n];
        // for (int i = 0; i < m; i++) {
        //     Arrays.fill(memoize[i], -1);
        // }
        // for (int j = 0; j < n; j++) {
        //     max = Math.max(max, recur(matrix, m, n, 0, j, memoize));
        // }
        // return max;

        int[][] table = new int[m][n];
        for (int j = 0; j < n; j++) {
            table[m-1][j] = matrix[m-1][j];
        }

        
        for (int i = m-2; i > -1; i--) {
            for (int j = 0; j < n; j++) {
                int leftDiagonal = (int)Math.pow(-10, 9);
                
                int rightDiagonal = (int)Math.pow(-10, 9);
                if (j > 0) leftDiagonal = matrix[i][j] + table[i+1][j-1];
                int bottom = matrix[i][j] + table[i+1][j];
                if (j < n-1) rightDiagonal = matrix[i][j] + table[i+1][j+1];

                table[i][j] = Math.max(leftDiagonal, Math.max(bottom, rightDiagonal));
            }
        }

        for (int j = 0; j < n; j++) {
            max = Math.max(max, table[0][j]);
        }
        return max;
        
	}
}
