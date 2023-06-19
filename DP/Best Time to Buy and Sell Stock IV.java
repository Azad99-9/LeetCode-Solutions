import java.util.* ;
import java.io.*; 
public class Solution
{
public static int maximumProfit(int[] prices, int n, int k)
    {
        int[][][] table = new int[prices.length+1][2][k+1];
		for(int i = n-1; i >= 0; i--) {
			for (int buy = 0; buy < 2; buy++) {
				for (int cap = 1; cap <= k; cap++) {
					int profit = 0;
					if (buy == 0) {
			profit = Math.max(-prices[i]+ table[i+1][1][cap],
			table[i+1][0][cap]);
		} else {
			profit = Math.max(prices[i]+ table[i+1][0][cap-1],
			table[i+1][1][cap]);
		}
				table[i][buy][cap] = profit;
				}
			}
		}
		return table[0][0][k];
    }
}
