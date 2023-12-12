//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean isValidI(int i, int n) {
        return (i > -1 && i < n);
    }
    static int f(int i, int j, int[][] M, int n, int m, int[][] dp) {
        if (j == m) return 0;
        
        if (dp[i][j] != -1) return dp[i][j];
        
        int cur = M[i][j];
        
        int du = 0, dd = 0, d = 0;
        
        if (isValidI(i-1, n)) du = f(i-1, j+1, M, n, m, dp);
        if (isValidI(i+1, n)) dd = f(i+1, j+1, M, n, m, dp);
        d = f(i, j+1, M, n, m, dp);
        
        return dp[i][j] = cur + Math.max(du, Math.max(dd, d));
    }
    static int maxGold(int n, int m, int M[][])
    {
        int max = 0;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) Arrays.fill(dp[i], -1);
        
        for (int i = 0; i < n; i++) {
            max = Math.max(max, f(i, 0, M, n, m, dp));
        }
        return max;
    }
}
