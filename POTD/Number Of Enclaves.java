
class Solution {
    private void dfs(int i, int j, boolean[][] vis, int[][] grid, int n, int m) {
        if (i >= n || j >= m || i < 0 || j < 0) return ;
        if (vis[i][j] || grid[i][j] == 0) return;
        
        vis[i][j] = true;
        
        int[] dx = new int[]{1, -1, 0, 0};
        int[] dy = new int[]{0, 0, 1, -1};
        
        for (int k = 0; k < 4; k++) {
            dfs(i + dx[k], j + dy[k], vis, grid, n, m);
        }
        
        return;
    }

    int numberOfEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        
        boolean[][] vis = new boolean[n][m];
        
        for (int i = 0; i < n; i++) {
            if (!vis[i][0] && grid[i][0] == 1) {
                dfs(i, 0, vis, grid, n, m);
            }
            if (!vis[i][m-1] && grid[i][m-1] == 1) {
                dfs(i, m-1, vis, grid, n, m);
            }
        }
        
        for (int i = 0; i < m; i++) {
            if (!vis[0][i] && grid[0][i] == 1) {
                dfs(0, i, vis, grid, n, m);
            }
            if (!vis[n-1][i] && grid[n-1][i] == 1) {
                dfs(n-1, i, vis, grid, n, m);
            }
        }
        
        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < m-1; j++) {
                if (!vis[i][j] && grid[i][j] == 1) cnt++;
            }
        }
        
        return cnt;
    }
}