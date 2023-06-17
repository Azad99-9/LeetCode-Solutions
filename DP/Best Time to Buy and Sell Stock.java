import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int mini = prices.get(0);
        int profit = 0;
        for (int i = 1; i < prices.size(); i++) {
            profit = Math.max(prices.get(i) - mini, profit);
            mini = Math.min(mini, prices.get(i));
        }
        return profit;
    }
}