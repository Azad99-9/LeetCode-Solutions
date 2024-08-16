class solve
{
    //Function to find the maximum possible amount of money we can win.
    
    // f: maximum value you pick from l to r.
    static long f(int l, int r, int[] arr, long[][] dp) {
        if (l > r) return 0;
        
        if (l == r) return arr[l];
        
        if(dp[l][r] != -1) return dp[l][r];
        
        // min because opponent tries to minimize the maxscore you gained.
        long chooseleft = arr[l] + Math.min(f(l+1, r-1, arr, dp), f(l+2, r, arr, dp));
        long chooseright = arr[r] + Math.min(f(l+1, r-1, arr, dp), f(l, r-2, arr, dp));
        
        return dp[l][r] = Math.max(chooseleft, chooseright);
    }
    
    static long countMaximum(int arr[], int n)
    {
        long[][] dp = new long[n][n];
        for (long[] x: dp) Arrays.fill(x, -1);
        return f(0, n-1, arr, dp);
    }
}

