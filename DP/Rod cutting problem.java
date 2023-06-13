import java.util.*;

public class Solution {
	public static int recur (int i, int price[], int n, int[][] dp)  {
		if (i == 0) return n*price[0];
		
		if (dp[i][n] != -1) return dp[i][n];
		int notTake = recur(i-1, price, n, dp);
		int take = Integer.MIN_VALUE;
		int rodLength = i+1;
		if (rodLength <= n) take = price[i] + recur(i, price, n-rodLength, dp);

		return dp[i][n] = Math.max(notTake, take);
	}
	public static int cutRod(int price[], int n) {
		// return recur(n-1, price, n);
		
		// int[][] memoize = new int[n][n+1];
		// for (int i = 0; i < n; i++) Arrays.fill(memoize[i], -1);
		// return recur(n-1, price, n, memoize);
		
		int[][] table = new int[n][n+1];
		for (int rodLength = 1; rodLength <= n; rodLength++) table[0][rodLength] = rodLength*price[0];
		for (int i = 1; i < n; i++) {
			for (int rodLength = 0; rodLength <= n; rodLength++) {
				int notTake = table[i-1][rodLength];
				int take = Integer.MIN_VALUE;
				if (i+1 <= rodLength) take = price[i] + table[i][rodLength-(i+1)];
				table[i][rodLength] = Math.max(take, notTake);
			}
		}

		return table[n-1][n];
	}
}