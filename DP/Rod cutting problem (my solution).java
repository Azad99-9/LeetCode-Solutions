import java.util.*;

public class Solution {
	public static int cutRod(int price[], int n) {
		int[] next = new int[n+1];
		int[] cur = new int[n+1];

		Arrays.fill(next, Integer.MIN_VALUE);
		next[n] = 0;

		for (int i = n-1; i > -1; i--) {
			for (int len = n; len > -1; len--) {
				int pick = Integer.MIN_VALUE;
				if (len + i+1 <= n)  pick = price[i] + cur[len + i+1];
				int notPick = next[len];
				cur[len] = Math.max(pick, notPick);
				
			}
			next = cur;
			cur = new int[n+1];
		}
		return next[0];
	}
}