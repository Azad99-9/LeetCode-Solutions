import java.util.*;

public class Solution {
	public static boolean recur(int i, int target, int arr[], int[][] dp) {
		if (target == 0) return true;

		if (i == 0) return arr[0] == target;

		if (dp[i][target] != -1)  return dp[i][target] == 0 ? false : true;
		boolean notTake = recur(i-1, target, arr, dp);

		boolean take = false;

		if (arr[i] <= target) {
			take = recur(i-1, target-arr[i], arr, dp);
		}

		dp[i][target] = notTake || take ? 1 : 0;
		return notTake || take;
	}

	public static boolean canPartition(int[] arr, int n) {
		int totSum = 0;

		for (int i = 0; i < n; i++) totSum += arr[i];
		

		if (totSum %2 == 1) return false;
		else {
			int k = totSum / 2;
			int[][] memoize = new int[n][k+1];
			for (int row[]: memoize) Arrays.fill(row, -1);
			return recur(n-1, k, arr, memoize);
		}
	}
}