class Solution {
    static int mod = 1000000007;
    static int nthFibonacci(int n){
        int a0 = 1;
        int a1 = 1;
        int cur = 1;
        for (int i = 3; i <= n; i++) {
            cur = (a0+a1) % mod;
            a0 = a1;
            a1 = cur;
        }
        return cur;
    }
}