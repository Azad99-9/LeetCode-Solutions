//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0)
        {
            String wild = in.readLine();
            String pattern = in.readLine();
            
            Solution ob = new Solution();
            boolean flag = ob.match(wild, pattern);
            if(flag)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static boolean match(String wild, String pattern) {
    int n = wild.length();
    int m = pattern.length();
    
    boolean[][] dp = new boolean[n+1][m+1];
    dp[0][0] = true;
    
    for (int i = 1; i <= n; i++) {
        char c = wild.charAt(i-1);
        if (c == '*') {
            dp[i][0] = dp[i-1][0];
            for (int j = 1; j <= m; j++) {
                dp[i][j] = dp[i-1][j] || dp[i][j-1];
            }
        } else {
            for (int j = 1; j <= m; j++) {
                if (c == pattern.charAt(j-1) || c == '?') {
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
    }
    
    return dp[n][m];
}

}