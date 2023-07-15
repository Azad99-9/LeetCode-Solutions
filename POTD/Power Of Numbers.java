class Solution
{
    int mod = (int)1e9+7;
        
    long power(int N,int R)
    {
        if (R == 1) return N;
        if (R == 0) return 1;
        long ans = power(N, R/2)%mod;
        if (R % 2 == 0)  {
            return (ans * ans)%mod;
        }
        return (((ans*ans)%mod)*N%mod);
    }

}
