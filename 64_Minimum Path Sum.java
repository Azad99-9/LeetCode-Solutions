class Solution {
    public int minPathSum(int[][] grid) {
    	// T - O ( m * n )
    	// S - O ( m )
        int n = grid.length;
        int m = grid[0].length;
        int[] prev = new int[m];
        for (int i = 0; i < n; i++) {
            int[] cur = new int[m];
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) cur[j] = grid[i][j];
                else {
                    int up = grid[i][j];
                    if (i > 0) up += prev[j];
                    else up += 1e9;

                    int left = grid[i][j];
                    if (j > 0) left += cur[j - 1];
                    else left += 1e9;

                    cur[j] = Math.min(up, left);
                }
            }
            prev = cur;
        }
        return prev[m - 1];
    }
}
