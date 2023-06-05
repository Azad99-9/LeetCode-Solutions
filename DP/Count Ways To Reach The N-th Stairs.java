import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static int recur (int n, int[] dp) {
		if (n == 0) return 1;
		if (n < 0) return 0;
		if (dp[n] == -1) dp[n] = recur(n-1, dp)+recur(n-2, dp);
		return dp[n];

	}

	public static int countDistinctWayToClimbStair(long nStairs) {
		int n = (int) nStairs;
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		dp[0] = 1;
		return recur(n, dp);
	}
}