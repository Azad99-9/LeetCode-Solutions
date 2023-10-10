class Solution {
    public int countVowelStrings(int n) {
        int[] prev = new int[5];
        int[] cur = new int[5];

        Arrays.fill(prev, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                int cs = 0;
                for (int k = j; k < 5; k++) {
                    cs += prev[k];
                }
                cur[j] = cs;
            }
            prev = cur;
            cur = new int[5];
        }

        int ans = 0;

        for (int i = 0; i < 5; i++) ans += prev[i];

        return ans;
    }
}