import java.util.* ;
import java.io.*; 

public class Solution{
    static int recur (int[] weight, int[] value, int n, int wt, int i, int[][] dp) {
        if (i == 0) {
            if (weight[i] <= wt) return value[i];
            else return 0;
        }

        if (dp[i][wt] != -1) return dp[i][wt];
        int notTake = recur(weight, value, n, wt, i-1, dp);
        int take = Integer.MIN_VALUE;
        if (weight[i] <= wt) take = value[i] + recur(weight, value, n, wt - weight[i], i-1, dp);

        return dp[i][wt] = Math.max(take, notTake);
    }
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        // return recur(weight, value, n, maxWeight, n-1);

        // int[][] memoize = new int[n][maxWeight+1];
        // for (int i = 0; i < n; i++) Arrays.fill(memoize[i], -1);

        // return recur(weight, value, n, maxWeight, n-1, memoize);
            
        int[][] table = new int[n][maxWeight+1];
        for(int i=weight[0]; i<=maxWeight; i++){
            table[0][i] = value[0];
        }
        for (int i = 1; i < n; i++) {
            for (int wt = 0; wt <= maxWeight; wt++) {
                int notTaken = 0 + table[i-1][wt];
            
                int taken = Integer.MIN_VALUE;
                if(weight[i] <= wt)
                    taken = value[i] + table[i-1][wt - weight[i]];
                    
                table[i][wt] = Math.max(notTaken, taken);
            }
        }

        return table[n-1][maxWeight];

    }
}