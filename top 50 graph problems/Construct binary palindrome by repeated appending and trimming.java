class Solution{
    public static String binaryPalindrome (int n, int k) {
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            ans.append('0');
        }
        
        int i = 0;
        while (i < n) {
            ans.setCharAt(i, '1');
            ans.setCharAt(n - i - 1, '1');
            i += k;
        }
        return ans.toString();
    }
}
