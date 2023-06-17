import java.util.* ;
import java.io.*; 
public class Solution {
	public static int recur(int i, int buy, int cap, ArrayList<Integer> prices, int[][][] dp) {
		if (i == prices.size() || cap == 0) return 0;

		if (dp[i][buy][cap] != -1 ) return dp[i][buy][cap];
		int profit = 0;
		if (buy == 1) {
			profit = Math.max(-prices.get(i)+ recur(i+1, 0, cap, prices, dp),
			recur(i+1, 1, cap, prices, dp));
		} else {
			profit = Math.max(prices.get(i)+ recur(i+1, 1, cap-1, prices, dp),
			recur(i+1, 0, cap, prices, dp));
		}

		return dp[i][buy][cap] = profit;
	}

	public static int maxProfit(ArrayList<Integer> prices, int n) {
		// return recur(0, 1, 2, prices);

		// int[][][] memoize = new int[prices.size()][2][3];
		// for (int i = 0; i < n; i++) for (int j = 0; j < 2; j++) Arrays.fill(memoize[i][j], -1);
		// return recur(0, 1, 2, prices, memoize);

		int[][][] table = new int[prices.size()+1][2][3];
		for(int i = n-1; i >= 0; i--) {
			for (int buy = 0; buy < 2; buy++) {
				for (int cap = 1; cap < 3; cap++) {
					int profit = 0;
					if (buy == 0) {
			profit = Math.max(-prices.get(i)+ table[i+1][1][cap],
			table[i+1][0][cap]);
		} else {
			profit = Math.max(prices.get(i)+ table[i+1][0][cap-1],
			table[i+1][1][cap]);
		}
				table[i][buy][cap] = profit;
				}
			}
		}
		return table[0][0][2];
	}
}