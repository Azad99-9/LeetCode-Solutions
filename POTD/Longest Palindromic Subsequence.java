class Solution
{
    public int recursion(int i, int j, char[] str, char[] reverse, int sLength, int[][] dp) {
        if(i == -1 || j == -1) return 0;
        
        if (dp[i][j] != -1) return dp[i][j];
        if (str[i] == reverse[j]) {
            return dp[i][j] = 1+recursion(i-1, j-1, str, reverse, sLength, dp);
        } else {
            return dp[i][j] = Math.max(recursion(i-1, j, str, reverse, sLength, dp),
            recursion(i, j-1, str, reverse, sLength, dp));
        }
    }
    public int longestPalinSubseq(String s)
    {
        int sLength = s.length();
        
        char[] str = s.toCharArray();
        char[] reverse = (new StringBuilder(s)).reverse().toString().toCharArray();
        
        
        int[][] dp = new int[sLength+1][sLength+1];
        // for (int[] subArr: dp) {
        //     Arrays.fill(subArr, -1);
        // }
        // return recursion(sLength-1, sLength-1, str, reverse, sLength, dp);
        for (int i = 1; i <= sLength; i++) {
            for (int j = 1;  j <= sLength; j++) {
                if (str[i-1] == reverse[j-1]) dp[i][j] = 1+dp[i-1][j-1];
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[sLength][sLength];
        
        
    }
}