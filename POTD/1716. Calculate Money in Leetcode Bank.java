class Solution {
    public int totalMoney(int n) {
        int ans = 0;
        int prev = 0;
        int init = 1;
        for (int i = 1; i <= n; i+=7) {
            int cur = init++;
            for (int j = i; j < i + 7 && j <= n; j++) {
                ans = ans + cur;
                cur = cur + 1;
            }
        }
        return ans;
    }
}
