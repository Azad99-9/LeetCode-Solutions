public class Solution {
	public static int cutRod(int price[], int n) {
		int[] prev = new int[n + 1];
		for (int N = 0; N <= n; N++) prev[N] = N * price[0];

		for (int ind = 1; ind < n; ind++) {
			for (int N = 0; N <= n; N++) {
				int notTake = prev[N];
				int take = Integer.MIN_VALUE;
				int rodLength = ind + 1;
				if (rodLength <= N) {
					take = price[ind] + prev[N - rodLength];
				}
				prev[N] = Math.max(take, notTake);
			}
		}

		return prev[n];
	}
}
