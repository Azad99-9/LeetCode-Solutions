class Solution{
    int mod = (int)1e9+7;
    long numberOfPaths(int M, int N) {
        long res = 1;
        int n = M+N-2;
        int r = M-1<N-1?M-1:N-1;
        
        for(int i = 1; i <= r; i++) {
            res = ((res*(n-r+i)%mod)*(modInverse(i, mod))) % mod;
        }
        
        return res;
    }
    
    long modInverse(int a, int b) {
        int x = 1, y = 0;
        while (a > 1) {
            int q = a/b, temp = b;
            b = a%b;
            a = temp;
            temp = y;
            y = x - q * y;
            x =  temp;
        }
        
        return x < 0?x + mod: x;
    }
    
}