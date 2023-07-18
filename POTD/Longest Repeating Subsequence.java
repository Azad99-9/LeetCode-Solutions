public int LongestRepeatingSubsequence(String str)
    {
        int[][] dp = new int[str.length()+1][str.length()+1];
        
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < dp.length; i++){
            for(int j= 1; j < dp.length;j++){
                if(i != j && str.charAt(i-1) == str.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
                max = Math.max(dp[i][j],max);
            }
        }
        return max;
    }