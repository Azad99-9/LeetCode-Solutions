import java.util.* ;
import java.io.*; 
public class Solution {
    public static int recur (int i, int j, int n, int[][] triangle, int[][] dp) {
        if (i == n-1) return triangle[n-1][j];

        if (dp[i][j] != -1) return dp[i][j];
        int down = triangle[i][j] + recur(i + 1, j, n, triangle, dp);
        int diagonal = triangle[i][j] + recur(i + 1, j + 1, n, triangle, dp);

        dp[i][j] = Math.min(down, diagonal);
        return dp[i][j];
    }

    public static int minimumPathSum(int[][] triangle, int n) {
        // return recur(0, 0, n, triangle);

        // int[][] memoize = new int[n][n];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         memoize[i][j] = -1;
        //     }
        // }
        // return recur(0, 0, n, triangle, memoize);

        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            table[n-1][i] = triangle[n-1][i];
        }
        for (int i = n-2; i > -1; i--) {
            for (int j = 0; j < i+1; j++) {
                int down = triangle[i][j] + table[i+1][j];
                int diagonal = triangle[i][j] + table[i+1][j+1];
                table[i][j] = Math.min(down, diagonal);
            }
        }
        return table[0][0];
    }
}