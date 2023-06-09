import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static int minSubsetSumDifference(int[] arr, int n) {
		int totSum = 0;
		for (int i = 0; i < n; i++) totSum += arr[i];
		int k = totSum;
		boolean[][] table = new boolean[n][k+1];
        for (int i = 0; i < n; i++) table[i][0] = true;
        if(arr[0] <= k) table[0][arr[0]] = true;
        for (int i = 1; i < n; i++) {
            for (int target = 1; target <= k; target++) {
                boolean notTake = table[i-1][target];
                boolean take = false;
                if (arr[i] <= target) take = table[i-1][target-arr[i]];
                table[i][target] = take || notTake;
            }
        }

		int mini = Integer.MAX_VALUE;
		for (int s1 = 0; s1 <= totSum/2; s1++) {
			if (table[n-1][s1] == true) 
				mini = Math.min(mini, Math.abs(totSum - s1) - s1);
		}

		return mini;

	}

}
