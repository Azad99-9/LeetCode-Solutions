
class Solution {
    int isDivisible(String s) {
        int n = s.length();
        // int odd = 0;
        // int even = 0;
        int ans = 0;
        // boolean flag = true;
        for (int i = n-1; i > -1; i--) {
            if (s.charAt(i) == '1') {
                if (i % 2 == 0) ans += 1;
            else ans += 2;
            }
        }
        // int diff = Math.abs(odd - even);
        return ans % 3 == 0 ? 1 : 0;
    }
}