class Solution {
    private int squres(int n) {
        int ans = 0;
        while (n != 0) {
            int rem = n%10;
            ans += rem * rem;
            n = n/10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        boolean[] vis = new boolean[1000];

        while (n != 1) {
            if (n < 1000 && vis[n]) return false;
            if (n < 1000) vis[n] = true;

            n = squres(n);
        }

        return true;
    }
}