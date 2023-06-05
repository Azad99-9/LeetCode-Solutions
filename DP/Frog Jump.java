import java.util.* ;
import java.io.*; 
public class Solution {
    public static int recur (int n, int[] h, int[] dp) {
        if (n == 0) return 0;
        
        if (dp[n] != -1) return dp[n];
        
        int left = recur(n-1,h,dp) + Math.abs(h[n] - h[n-1]);
        int right = n > 1 ? recur(n-2,h, dp) + Math.abs(h[n] - h[n-2]) : Integer.MAX_VALUE;

        dp[n] = Math.min(left, right);

        return dp[n];
    }
    
    public static int frogJump(int n, int heights[]) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        // for memoization
        // return recur(n-1, heights, dp); 

        // for tabulation
        // dp[0] = 0;
        // for (int i = 1; i < n; i++) {
        //     int fs = dp[i-1] + Math.abs(heights[i] - heights[i-1]);
        //     int ss = Integer.MAX_VALUE;
        //     if (i > 1) ss = dp[i-2] + Math.abs(heights[i] - heights[i-2]);

        //     dp[i] = Math.min(fs, ss);
        // }
        // return dp[n-1];

        // for space optimization
        int pre1 = 0;
        int pre2 = 0;
        int cur = 0;
        for (int i = 1; i < n; i++) {
            int fs = pre1 + Math.abs(heights[i] - heights[i-1]);
            int ss = Integer.MAX_VALUE;
            if (i > 1) ss = pre2 + Math.abs(heights[i] - heights[i-2]);

            cur = Math.min(fs, ss);
            pre2 = pre1;
            pre1 = cur;
            
            
        }

        return cur;
    }

}