class Solution {
    // T - O ( m * n ) // S - O ( m )
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[] prev = new int[m];
        for (int i = 0; i < n; i++) {
            int[] cur = new int[m];
            for (int j = 0; j < m; j++) {
                if (obstacleGrid[i][j] == 1) cur[j] = 0;
                else if (i == 0 && j == 0) cur[j] = 1;
                else {
                    int up = 0, left = 0;
                    if (i > 0) up = prev[j];
                    if (j > 0) left = cur[j - 1];
                    cur[j] = (up + left);
                }
            }
            prev = cur;
        }
        return prev[m - 1];
    }
}
