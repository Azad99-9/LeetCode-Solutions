import java.util.* ;
import java.io.*; 
 

public class Solution {

	public static int stockProfit(int[] prices) {
		int n= prices.length;
		int[][] table = new int[n+2][2];
		for (int i = n-1; i >= 0; i--) {
			table[i][1] = Math.max(-prices[i]+table[i+1][0], table[i+1][1]);
			table[i][0] = Math.max(prices[i]+table[i+2][1], table[i+1][0]);
		}
		return table[0][1];
	}
}
