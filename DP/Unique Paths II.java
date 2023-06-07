import java.util.*;

public class Solution {
    static int recur (int i, int j, int m, int n, ArrayList<ArrayList<Integer>> mat, int[][] dp) {
        
        if (i == 0 && j == 0) return 1;
        if (i < 0 || j < 0 || mat.get(i).get(j) == -1) return 0;

        if (dp[i][j] != -1) return dp[i][j];
        int up = recur(i-1, j, m, n, mat, dp);
        int left = recur(i, j-1, m, n, mat, dp);

        dp[i][j] = up + left;
        return dp[i][j];
    }

    static int mazeObstacles(int n, int m, ArrayList<ArrayList<Integer>> mat) {
        // return recur(n-1, m-1, n, m, mat);

        // int[][] memoize = new int[n][m];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         memoize[i][j] = -1;
        //     }
        // }
        // return recur(n-1, m-1, n, m, mat, memoize);

        int[][] table = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) table[i][j] = 1;
                else if (mat.get(i).get(j) == -1) table[i][j] = 0;
                else {
                    int up = 0;
                    int left = 0;
                    if (i > 0) up = table[i-1][j];
                    if (j > 0) left = table[i][j-1];
                    table[i][j] = up + left;
                }
            }
        }

        return table[n-1][m-1];
    }

}
