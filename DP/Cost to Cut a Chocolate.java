import java.util.* ;
import java.io.*; 
public class Solution {
    public static int cost(int n, int c, int[] cuts) {
        int[] extendedCuts = new int[cuts.length + 2];
        System.arraycopy(cuts, 0, extendedCuts, 1, cuts.length);
        extendedCuts[0] = 0;
        extendedCuts[extendedCuts.length - 1] = n;
        Arrays.sort(extendedCuts);

        int[][] dp = new int[c + 2][c + 2];

        for (int i = c; i >= 1; i--) {
            for (int j = 1; j <= c; j++) {

                if (i > j) continue;

                int mini = Integer.MAX_VALUE;

                for (int ind = i; ind <= j; ind++) {

                    int ans = extendedCuts[j + 1] - extendedCuts[i - 1] + dp[i][ind - 1] + dp[ind + 1][j];

                    mini = Math.min(mini, ans);
                }

                dp[i][j] = mini;
            }
        }

        return dp[1][c];
    }
}