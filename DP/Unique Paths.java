import java.util.* ;
import java.io.*; 
public class Solution {
	public static int recur (int i, int j, int[][] dp) {
		if (i == 0 || j == 0) return 1;
		if (i < 0 || j < 0) return 0;

		if (dp[i][j] != -1) return dp[i][j];
		int up = recur(i - 1, j, dp);
		int left = recur(i, j - 1, dp);
		
		dp[i][j] = up + left;
		return dp[i][j];
	}
	
	public static int uniquePaths(int m, int n) {
		// return recur(m-1, n-1);

		// int[][] memoize = new int[m][n];
		// for (int i = 0; i < m; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		memoize[i][j] = -1;
		// 	}
		// }
		// return recur(m-1, n-1, memoize);


		int[][] table = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j == 0) table[i][j] = 1;
				else {
					int up = 0;
					int left = 0;

					if (i > 0) up = table[i - 1][j];
					if (j > 0) left = table[i][j - 1];

					table[i][j] = up+left;
				}
			}
		}

		return table[m-1][n-1];
		
	}
}