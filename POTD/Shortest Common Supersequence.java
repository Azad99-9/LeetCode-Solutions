class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int lcs(int i, int j, String x, String y, int[][] dp) {
        if (i == x.length()) return 0;
        
        if (j == y.length()) return 0;
        
        if (dp[i][j] != -1) return dp[i][j];
        
        int a = 0, b = 0;
        if (x.charAt(i) == y.charAt(j)) a = 1 + lcs(i+1, j+1, x, y, dp);
        
        b = Math.max(lcs(i+1, j, x, y, dp), lcs(i, j+1, x, y, dp));
        
        int tmp = Math.max(a, b);
        dp[i][j] = tmp;
        return tmp;
    }
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        int[][] dp = new int[m][n];   
        for (int[] sub: dp) Arrays.fill(sub, -1);
        return (m + n)-lcs(0, 0, X, Y, dp);
    }
}
