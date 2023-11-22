class Solution
{
    //Function to return the total number of possible unique BST.
    static int numTrees(int N)
    {
        long mod =1000000007;
       long [] dp = new long [N+1];
       dp[0] =1;
       for(int i =1; i<=N; ++i){
           for(int j =0; j<i; ++j)
dp[i] =(dp[i]%mod+(dp[j]%mod*dp[i-j-1]%mod)%mod)%mod;
       }
       return (int)dp[N];
        
        
    }
}

