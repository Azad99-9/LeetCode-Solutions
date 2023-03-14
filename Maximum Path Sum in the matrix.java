import java.util.* ;
import java.io.*; 

public class Solution {
	public static int getMaxPathSum(int[][] matrix) {
		int n = matrix.length;
		// Write yint n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];

        for (int j = 0; j < m; j++) dp[0][j] = matrix[0][j];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int u = matrix[i][j] + dp[i-1][j];
                int ld = matrix[i][j];
                if (j - 1 >= 0) ld += dp[i- 1][j - 1];
                else ld += -1e8;
                int rd = matrix[i][j];
                if (j + 1 < m) rd += dp[i - 1][j + 1];
                else rd += -1e8;
                dp[i][j] = Math.max(u, Math.max(ld, rd));
            }
        }

        int ans = (int)-1e8;
        for (int j = 0; j < m; j++) ans = Math.max(ans, dp[n-1][j]);

        return ans;
	}
}

