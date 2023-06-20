import java.util.*;
public class Solution {
	public static int recur(int i, int prev_ind, int[] arr, int[][] dp) {
		if (i == arr.length) return 0;

		if (dp[i][prev_ind+1] != -1) return dp[i][prev_ind+1];
		int notTake = recur(i+1, prev_ind,arr, dp);
		int take = Integer.MIN_VALUE;
		if (prev_ind == -1 || arr[i] > arr[prev_ind]) {
			take = 1+recur(i+1, i, arr, dp);
		}
		return dp[i][prev_ind+1] = Math.max(notTake, take);
	}

	public static int longestIncreasingSubsequence(int arr[]) {
		// return recur(0, -1, arr);

		// int[][] memoize = new int[arr.length][arr.length+2];
		// for (int i = 0; i < memoize.length; i++) Arrays.fill(memoize[i],-1);
		// return recur(0, -1, arr, memoize);

		// int[][] table = new int[arr.length+1][arr.length+2];
		// int[] next = new int[arr.length+1];
		// int[] cur = new int[arr.length];
		// for (int i = arr.length - 1; i > -1; i--) {
		// 	for (int prev_ind = i-1; prev_ind >= -1; prev_ind--) {
		// 		int notTake = next[prev_ind+1];
		// 		int take = Integer.MIN_VALUE;
		// 		if (prev_ind == -1 || arr[i] > arr[prev_ind]) {
		// 			take = 1+next[i+1];
		// 		}
		// 		cur[prev_ind+1] = Math.max(notTake, take);
		// 	}
		// 	next = cur;
		// }
		// return cur[0];

		int[] dp = new int[arr.length];
		Arrays.fill(dp, 1);
		for (int i = 0; i < arr.length; i++) {
			for (int prev_ind = 0; prev_ind < i; prev_ind++) {
				if (arr[i] > arr[prev_ind]) {
					dp[i] = Math.max(1+dp[prev_ind], dp[i]);
				}
			}
		}
		int max = 1;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(dp[i], max);
		}
		return max;
	}

}