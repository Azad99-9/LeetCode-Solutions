import java.util.*;

public class Solution {
	public static int recur(char[] s, char[] t, int i1, int i2, int[][] dp) {
		if (i1 < 0 || i2 < 0) return 0;

		if (dp[i1][i2] != -1) return dp[i1][i2];
		if (s[i1] == t[i2]) return dp[i1][i2] = 1 + recur(s, t, i1-1, i2-1, dp);
		return dp[i1][i2] = Math.max(recur(s, t, i1-1, i2, dp), recur(s, t, i1, i2-1, dp));
	}

	public static int lcs(String s, String t) {
		// return recur(s.toCharArray(), t.toCharArray(), s.length() - 1, t.length() - 1);

		int n = s.length();
		int m = t.length();
		// int[][] memoize = new int[n][m];
		// for (int i = 0; i < n; i++) Arrays.fill(memoize[i], -1);
		// return recur(s.toCharArray(), t.toCharArray(), n-1, m-1, memoize);

		int[][] table = new int[n+1][m+1];
		char[] sarr = s.toCharArray();
		char[] tarr = t.toCharArray();
		for (int i1 = 1; i1 <= n; i1++) {
			for (int i2 = 1; i2 <= m; i2++) {
				if (sarr[i1-1] == tarr[i2-1]) table[i1][i2] = 1 + table[i1-1][i2-1];
				else {
					table[i1][i2] = Math.max(table[i1-1][i2], table[i1][i2-1]);
				}
			}
		}
		return table[n][m];
    }

}