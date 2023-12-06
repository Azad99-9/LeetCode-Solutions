class Solution {
    int countX(int L, int R, int X) {
        int ans = 0;
        for (int i = L + 1; i < R; i++) {
            int c = i;
            while (c != 0) {
                int t = c % 10;
                if (t == X) ans++;
                c = c / 10;
            }
        }
        
        return ans;
    }
};
