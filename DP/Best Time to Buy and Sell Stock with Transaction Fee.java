import java.util.* ;
import java.io.*; 
public class Solution {
	public static int maximumProfit(int n, int fee, int[] prices) {
		int aheadNotBuy, aheadBuy, curBuy, curNotBuy;
		aheadNotBuy = aheadBuy = 0;
		for(int i = n-1; i >= 0; i--) {
			curNotBuy = Math.max(prices[i]-fee + aheadBuy, aheadNotBuy);
			curBuy = Math.max(-prices[i]+ aheadNotBuy, aheadBuy);
			aheadBuy = curBuy;
			aheadNotBuy = curNotBuy;
		}
		return aheadBuy;
	}
}