class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;
        int j = 0;
        for (int i = 0; i < g.length && j < s.length; ) {
            if (g[i] <= s[j]) {
                ans++;
                i++;
            }
            j++;
        }
        return ans;
    }
}