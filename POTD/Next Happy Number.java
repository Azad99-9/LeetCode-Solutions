class Solution{
    static int squareOfDigits (int N) {
        String n = String.valueOf(N);
        int ans = 0;
        for (int i = 0; i < n.length(); i++) {
            ans +=(int) Math.pow(n.charAt(i) - '0',2);
        }
        return ans;
    }
    
    static int recur(int N, int[] dp) {
        
        
        if (dp[N] > -1) return dp[N];
        if (dp[N] == -2) return dp[N] = 0;
        
        int squares = squareOfDigits(N);
        // System.out.println(squares);
        // if (squares == N) return dp[N] = 0;
        
        dp[N] = -2;
        return dp[N] = recur(squares, dp);
        
        
    }

    static int nextHappy(int N){
        int[] dp = new int[500];
        Arrays.fill(dp, -1);
        // dp[0] = 0;
        dp[1] = 1;
        for (int i = 0; i < 500; i++) {
            
            recur(i, dp);
        }
        // for (int i = 0; i < dp.length; i++) System.out.println(dp[i]);
        boolean gotNum = false;
        int i = N+1;
        while(!gotNum) {
            gotNum = dp[squareOfDigits(i)] == 0 ?false: true;
            i++;
        }
        return i-1;
        // return dp.length;
    }
}