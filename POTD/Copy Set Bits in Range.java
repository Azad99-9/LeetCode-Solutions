class Solution{
    static int setSetBit(int x, int y, int l, int r){
        int c = 1;
        int pos = 0;
        int ans = 0;
        while (x != 0 || y != 0) {
            int xrem = x % 2;
            int yrem = y % 2;
            x = x/2;
            y = y/2;
            if (c >= l && c <= r) {
                if (xrem == 1 || yrem == 1) ans += (int)Math.pow(2, pos);
            }
            else {
                if (xrem == 1) ans += (int)Math.pow(2, pos);
            }
            pos++;c++;
        }
        return ans;
    }