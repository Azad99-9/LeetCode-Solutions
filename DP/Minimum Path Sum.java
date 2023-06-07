import java.util.* ;
import java.io.*; 
public class Solution {
    public static int recur (int i, int j, int n, int m, int[][] grid, int[][] dp) {
        if (i == 0 && j == 0) return grid[i][j];
        if (i < 0 || j < 0) return (int)Math.pow(10, 9);

        if (dp[i][j] != -1) return dp[i][j];
        int up = grid[i][j] + recur(i - 1, j, n, m, grid, dp);
        int left = grid[i][j] + recur(i, j - 1, n, m, grid, dp);

        dp[i][j] = Math.min(up, left);
        return dp[i][j];
    }

    public static int minSumPath(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
    	// return recur(n-1, m-1, n, m, grid);

        // int[][] memoize = new int[n][m];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         memoize[i][j] = -1;
        //     }
        // }
        // return recur(n-1, m-1, n, m, grid, memoize);

        int[][] table = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) table[i][j] = grid[i][j];
                else {
                    int up = (int)Math.pow(10, 9);
                    int left = (int)Math.pow(10, 9);
                    if (i > 0) up = grid[i][j] + table[i-1][j];
                    if (j > 0) left = grid[i][j] + table[i][j-1];

                    table[i][j] = Math.min(up, left);
                }
            }
        }
        return table[n-1][m-1];
    }
}