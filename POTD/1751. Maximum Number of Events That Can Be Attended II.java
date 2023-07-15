class Solution {
    int[][] events;
    public int maxValue(int[][] events, int k) {
        this.events = events;
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int n = events.length;
        
        dp = new int[k + 1][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return dfs(0, k);
    }    
    
    private int[][] dp;
    private int dfs(int index, int count) {
        
        if (count == 0 || index == events.length) {
            return 0;
        }
        if (dp[count][index] != -1) {
            return dp[count][index];
        }
        int nextIndex = binarySearch(events[index][1]);
        dp[count][index] = Math.max( events[index][2] + dfs(nextIndex, count - 1), dfs(index + 1, count));
        return dp[count][index];
    }
    
    public int binarySearch( int target) {
        int left = 0, right = events.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (events[mid][0] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }   
}