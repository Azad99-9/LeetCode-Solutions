class Solution {
    public String shortestCommonSupersequence(String a, String b) {
        int m = a.length();
        int n = b.length();

        int[][] dp = new int[m+1][n];

        for (int i = m-1; i > -1; i--) {
            for (int j = n-1; j>-1; j--) {
                if (a.charAt(i) == b.charAt(j)) {
                    dp[i][j] = 1 + ((j+1) < n ? dp[i+1][j+1]: 0);
                } else {
                    int right = (j+1) < n ? dp[i][j+1] : 0;
                    int down = dp[i+1][j];
                    dp[i][j] = Math.max(right, down);
                }
            }
        }

        System.out.println(dp[0][0]);
        
        int index = dp[0][0];
        StringBuilder ans = new StringBuilder();
        Set<Character> lcs = new HashSet<>();
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a.charAt(i) == b.charAt(j)) {
                ans.append(a.charAt(i));
                index--;
                i++; j++;
            } else {
                int right = 0;
                if (j+1 < n) right = dp[i][j+1];
                int down = 0;
                if (i+1 < m) down = dp[i+1][j];
                int max = Math.max(right, down);
                if (max == down) {
                    ans.append(a.charAt(i));
                    i++;
                } else {
                    ans.append(b.charAt(j));
                    j++;
                }
            }
        }
        
        while (i < m) {
            ans.append(a.charAt(i)); 
            i++;
        }
        while (j < n) {
            ans.append(b.charAt(j));
            j++;
        }

        return ans.toString();
    }
}