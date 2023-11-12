class Solution {
    public long distributeCandies(int n, int limit) {
        long ans = 0;
        
        for (int i = 0; i < limit+1; i++) {
            int nn = n - i;
            
            if (nn < 0) break;

            if (nn == 0) {
                ans += 1;
                continue;
            }

            if (nn <= limit) ans += nn + 1;
            else if (nn > limit) {
                if (nn > 2 * limit) continue;
                else if (nn == 2 * limit) ans++;
                else {
                    int b = nn - limit;
                    ans += limit - b + 1;
                }
            }
        }
        
        return ans;
    }
}
