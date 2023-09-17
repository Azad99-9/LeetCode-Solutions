
class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        int dp [] = new int[n+1];
        
        dp[n] = 1;
        int mod = (int)1e9+7;
        
        for (int i = n-1; i > -1; i--) {
            int onestep = i+1;
            int twostep = i+2;
            int threestep = i+3;
            int cur = 0;
            if (onestep <= n) {
                cur += dp[onestep];
                cur = cur % mod;
            }
            if (twostep <= n) {
                cur += dp[twostep];
                cur = cur % mod;
            }
            if (threestep <= n) {
                cur += dp[threestep];
                cur = cur % mod;
            }
            dp[i] = cur;
        }
        
        return dp[0] % mod;
    }
    
}