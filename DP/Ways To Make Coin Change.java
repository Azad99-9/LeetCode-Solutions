import java.util.*;
public class Solution {
	public static long recur(int i, int[] arr, int value, long[][] dp) {
		if (i == 0) {
			if (value % arr[i] == 0) return 1;
			return 0;
		}

		if (dp[i][value] != -1) return dp[i][value];
		long notTake = recur(i-1, arr, value, dp);
		long take = 0;
		if (arr[i] <= value) take = recur(i, arr, value - arr[i], dp);

		return dp[i][value] = take + notTake;
	}

	public static long countWaysToMakeChange(int denominations[], int value){
		int n = denominations.length;
        // return recur(n - 1, denominations, value);

		// long[][] memoize = new long[n][value + 1];
		// for (int i = 0; i < n; i++) Arrays.fill(memoize[i], -1);
		// return recur(n-1, denominations, value, memoize);

		long[][] table = new long[n][value+1];
		for (int v = 0; v <= value; v++) if (value % denominations[0] == 0) table[0][v] = 1;

		for (int i = 1; i < n; i++) {
			for (int v = 0; v <= value; v++) {
				long notTake = table[i-1][v];
				long take = 0;
				if (denominations[i] <= v) take = table[i][v - denominations[i]];
				table[i][v] = take + notTake;
			}
		}
		return table[n-1][value];

	}
	
}