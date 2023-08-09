class Solution{
    static long largestPrimeFactor(int N) {
        int ans = 1;
        
        for (int i = 2; i*i <= N; i++) {
            if (N % i == 0) {
                ans = i;
                while (N%i == 0) {
                    N/=i;
                }
            }
        }
        
        if (N > 1) ans = Math.max(ans, N);
        
        return ans;
    }
}