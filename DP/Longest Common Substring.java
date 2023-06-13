import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static int lcs(String s, String t) {
		int n = s.length() ;
		int m = t.length() ;
		int max = 0;
		int[][] table = new int[n+1][m+1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (s.charAt(i-1) == t.charAt(j-1))
				{
					table[i][j] = 1 + table[i-1][j-1];
					
				}
				else {
					table[i][j] = 0;
				}
				max = Math.max(max, table[i][j]);
			}
		}
		return max;
	}
}