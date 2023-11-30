class Solution{
    public int minStep(int n)
    {
        int ans = 0;
        while (n != 1) {
            if (n % 3 == 0) n = n/3;
            else n = n-1;
            ans++;
        }
        return ans;
    }
}

