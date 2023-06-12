import java.util.* ;
import java.io.*; 
public class Solution {
    public static int recur(int i, int w, int[] profit, int[] weight, int[][] dp) {
        if (i == 0) {
            return ((int)(w/weight[i])) * profit[i];
            
        }

        if (dp[i][w] != -1) return dp[i][w];
        int notTake = recur(i-1, w, profit, weight, dp);
        int take = (int)Math.pow(-10,9);
        if (weight[i] <= w) take = profit[i] + recur(i, w - weight[i], profit, weight, dp);

        return dp[i][w] = Math.max(notTake, take);
    }

    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        // return recur(n-1, w, profit, weight);

        // int[][] memoize = new int[n][w + 1];
        // for (int i = 0; i < n; i++) Arrays.fill(memoize[i], -1);
        // return recur(n-1, w, profit, weight, memoize);

        int[][] table = new int[n][w+1];
        for (int wt = 0; wt <= w; wt++) table[0][wt] = ((int)(wt/weight[0])) * profit[0];

        for (int i = 1; i < n; i++) {
            for (int wt = 0; wt <= w; wt++) {
                int notTake = table[i-1][wt];
                int take = (int)Math.pow(-10,9);
                if (weight[i] <= wt) take = profit[i] + table[i][ wt - weight[i]];

                table[i][wt] = Math.max(notTake, take);
            }
        }

        return table[n-1][w];
    }
}
