import java.util.*;

public class Solution {
    public static long recur(int i, int buy, long profit, long[] values, long[][] dp) {
        if (i == values.length) return 0;

        if (dp[i][buy] != -1) return dp[i][buy];
        if (buy == 1) {
            profit = Math.max(-values[i] + recur(i+1, 0, profit, values, dp), recur(i+1, 1, profit, values, dp));
        } else {
            profit = Math.max(values[i] + recur(i+1, 1, profit, values, dp), recur(i+1, 0, profit, values, dp));
        }
        return dp[i][buy] = profit;
    }

    public static long getMaximumProfit (int n, long[] values) {
        
        // return recur(0, 1, 0, values);

        // long[][] memoize = new long[values.length][2];
        // for (int i = 0; i < memoize.length; i++) Arrays.fill(memoize[i], -1);
        // return recur(0, 1, 0, values, memoize);

        // long[][] table = new long[values.length+1][2];
        // table[values.length][0] = 0;
        // table[values.length][1] = 0;


        long[] cur = new long[2];
        long[] prev;
        cur[0] = 0;
        cur[1] = 0;
        for (int i = values.length - 1; i > -1; i--) {
            for (int buy = 0; buy < 2; buy++) {
                long profit = 0;
                if (buy == 1) {
            profit = Math.max(values[i] + cur[0], cur[1]);
        } else {
            profit = Math.max(-values[i] + cur[1], cur[0]);
        }
            cur[buy] = profit;
            }
            prev = (long[])(cur.clone());
        }
        return cur[0];
        
    }
}
