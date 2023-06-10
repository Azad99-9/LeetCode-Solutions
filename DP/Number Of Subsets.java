import java.util.* ;
import java.io.*; 
public class Solution {
    public static int recur(int i, int[] nums, int tar, int[][] dp) {
        if (tar == 0) return 1;
        if (i == 0) return nums[i] == tar ? 1 : 0;

        if (dp[i][tar] != -1) return dp[i][tar];
        int notTake = recur(i-1, nums, tar, dp);
        int Take = 0;
        if (nums[i] <= tar) Take = recur(i-1, nums, tar-nums[i], dp);

        return dp[i][tar] = Take + notTake;
    }

    public static int findWays(int num[], int tar) {
        int n = num.length;
        // return recur(n-1, num, tar);

        // int[][] memoize = new int[n][tar+1];
        // for (int i = 0; i < n; i++) {
        //     Arrays.fill(memoize[i], -1);
        // }
        // return recur(n-1, num, tar, memoize);

        int[][] table = new int[n][tar+1];
        for (int i = 0; i < n; i++) table[i][0] = 1;
        if (tar >= num[0]) table[0][num[0]] = 1;
        for (int i = 1; i < n; i++) {
            for (int target = 1; target <= tar; target++) {
                int notTake = table[i-1][target];
                int Take = 0;
                if (num[i] <= target) Take = table[i-1][target - num[i]];
                table[i][target] = Take + notTake;
            }
        }
        return table[n-1][tar];

    }
}