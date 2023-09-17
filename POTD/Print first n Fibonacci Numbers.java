class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        long[] ans = new long[n];
        if (n == 1) {
            ans[0] = 1;
            return ans;
        }
        if (n == 2) {
            ans[0] = 1;
            ans[1] = 1;
            return ans;
        }
        ans[0] = 1;
        ans[1] = 1;
        for (int i = 3; i <= n; i++) {
            ans[i-1] = ans[i-2] + ans[i-3];
        }
        return ans;
    }
}