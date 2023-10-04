class Solution {
    
    private int recursion(int i, String s, int n, boolean isSingle, Map<Integer, int[]> dp) {
        if (i == n) return 1;

        int div = isSingle ? 0 : 1;
        if (dp.containsKey(i)) {
            if (dp.get(i)[div] != -1) return dp.get(i)[div];
        } else {
            dp.put(i, new int[]{-1, -1});
        }

        int single = 0;
        if (i == -1 || s.charAt(i) != '0') single += recursion(i+1, s, n, true, dp);
        
        int doble = 0;
        if (i != -1 && s.charAt(i) != '0' && i + 1 < n && Integer.valueOf(s.substring(i, i+2)) <= 26) {
            doble += recursion(i+2, s, n, false, dp);
        }

        dp.get(i)[div] = single + doble;
        return dp.get(i)[div];
    }
    
    public int numDecodings(String s) {
        Map<Integer, int[]> dp = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) Arrays.fill(dp[i], -1);
        recursion(-1, s, s.length(), true, dp);
        return dp.get(-1)[0];
        
    }
}