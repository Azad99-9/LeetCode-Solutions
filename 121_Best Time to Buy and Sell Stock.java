class Solution {
    public int maxProfit(int[] prices) {
        int totalDays = prices.length;
        int max_profit = 0;
        int min_price = Integer.MAX_VALUE;
        for (int i = 0; i < totalDays; i++) {
            // to check if current price is the minimum price so far
            if (min_price > prices[i]) min_price = prices[i];

            // if curent price is not minimum price so far then curent price - minimum price so far is the max profit found so far
            else if (prices[i] - min_price > max_profit) max_profit = prices[i] - min_price;
        }
        return max_profit;
    }
}
