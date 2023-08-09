class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] table = new int[n+1][2][3];
		for(int i = n-1; i >= 0; i--) {
			for (int buy = 0; buy < 2; buy++) {
				for (int cap = 1; cap < 3; cap++) {
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
		return table[0][0][2];
    }
}