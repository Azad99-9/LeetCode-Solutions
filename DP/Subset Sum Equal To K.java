import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean recur (int i, int target, int[] arr, int[][] dp) {
        if (target == 0) return true;
        if (i == 0) return arr[0] == target;

        if (dp[i][target] != -1) return dp[i][target] == 0 ? false : true;
        boolean notTake = recur(i-1, target, arr, dp);
        boolean take = false;
        if (arr[i] <= target) take = recur(i-1, target-arr[i], arr, dp);
        dp[i][target] = notTake || take ? 1 : 0;
        return take || notTake;
    }
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // return recur(n-1, k, arr);

        // int[][] memoize = new int[n][k+1];
        // for (int i = 0; i < n; i++) {
        //     Arrays.fill(memoize[i], -1);
        // }
        // return recur(n-1, k, arr, memoize);

        boolean[][] table = new boolean[n][k+1];
        for (int i = 0; i < n; i++) table[i][0] = true;
        if(arr[0] <= k) table[0][arr[0]] = true;
        for (int i = 1; i < n; i++) {
            for (int target = 1; target <= k; target++) {
                boolean notTake = table[i-1][target];
                boolean take = false;
                if (arr[i] <= target) take = table[i-1][target-arr[i]];
                table[i][target] = take || notTake;
            }
        }

        return table[n-1][k];
    }
}
