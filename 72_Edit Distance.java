class Solution {
    public int minDistance(String word1, String word2) {
    // T - O(m*n)
    // S - O(m)
        int n = word1.length();
        int m = word2.length();

        int[] prev = new int[m+1];
        int[] cur = new int[m+1];
        for (int j = 0; j <= m; j++) prev[j] = j;

        for (int i = 1; i <= n; i++) {
            cur[0] = i;
            for (int j = 1; j <= m; j++) {
                if(word1.charAt(i - 1) == word2.charAt(j - 1))
                    cur[j] = prev[j - 1];
                else cur[j] = 1 + Math.min(prev[j], Math.min(cur[j - 1], prev[j - 1]));
            }
            prev = (int[])(cur.clone());
        }
        return prev[m];
    }
}


