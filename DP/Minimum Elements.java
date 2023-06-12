import java.util.* ;
import java.io.*; 
public class Solution {
    public static int recur(int i, int num[], int x, int[][] dp) {
        if (i == 0) {
            if (x % num[i] == 0) return x / num[i];
            return (int)Math.pow(10, 9);
        }
        if (dp[i][x] != -1) return dp[i][x];
        int notTake = recur(i - 1, num, x, dp);
        int take = (int)Math.pow(10, 9);
        if (num[i] <= x) take = 1 + recur(i, num, x - num[i], dp);

        return dp[i][x] = Math.min(notTake, take);
    }
    public static int minimumElements(int num[], int x) {
        int n = num.length;

        // int[][] memoize = new int[n][x+1];
        // for (int i = 0; i < n; i++) Arrays.fill(memoize[i], -1);
        // int ans = recur(num.length - 1, num, x, memoize);

        int[][] table = new int[n][x+1];
        for (int i = 0; i <= x; i++) {
            if (i % num[0] == 0) table[0][i] = i / num[0];
            else table[0][i] = (int)Math.pow(10,9);
        }
        for (int i = 1; i < n; i++) {
            for (int t = 0; t <= x; t++) {
                int notTake = table[i - 1][t];
                int take = (int)Math.pow(10, 9);
                if (num[i] <= t) take = 1 + table[i][t-num[i]];
                table[i][t] = Math.min(notTake, take);
            }
        }
        int ans = table[n-1][x];
        if (ans >= Math.pow(10, 9)) return -1;
        return ans;
    }

}