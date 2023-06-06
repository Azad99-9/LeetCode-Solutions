import java.util.* ;
import java.io.*; 
import java.util.*;

public class Solution {
    public static int recur (int n, int points[][], int day, int last, int dp[][]) {
        if (day == 0) {
            int max = 0;
            for (int i = 0; i <= 2; i++) {
                if (i != last) {
                    max = Math.max(max, points[day][i]);
                }
            }
            return max;
        }
        if (dp[day][last] != -1) return dp[day][last];
        
        int max = 0;
        for (int i = 0; i <= 2; i++) {
            if (i != last) {
                max = Math.max(max, points[day][i] + recur(n, points, day - 1, i, dp));
            }
        }

        dp[day][last] = max;
        return dp[day][last];
    }
    public static int ninjaTraining(int n, int points[][]) {

        // memoization
        // int[][] memoize = new int[n][4];
        // for (int[] sublist : memoize) {
        //     Arrays.fill(sublist, -1);
        // }
        // return recur(n, points, n-1, 3, memoize);

        // tabulation
        int[][] table = new int[n][4];
        for (int[] sublist : table) {
            Arrays.fill(sublist, -1);
        }
        table[0][0] = Math.max(points[0][1], points[0][2]);
        table[0][1] = Math.max(points[0][0], points[0][2]);
        table[0][2] = Math.max(points[0][1], points[0][0]);
        table[0][3] = Math.max(table[0][0], Math.max(table[0][1], table[0][2]));

        for (int day = 1; day < n; day++) {
            for (int last = 0; last < 4; last++) {
                
                int max = 0;
                for (int task = 0; task <= 2; task++) {
                    if (task != last) {
                        max = Math.max(max, points[day][task] + table[day-1][task]);
                    }
                }
                table[day][last] = max;
            }
        }

        return table[n-1][3];
    }

}