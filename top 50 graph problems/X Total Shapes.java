class Solution
{
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    
    private void dfs(int i, int j, char[][] grid, boolean[][] vis) {
        int n = grid.length;
        int m = grid[0].length;
        
        if (i >= n || j >= m || i <= -1 || j <= -1 || grid[i][j] != 'X' || vis[i][j]) return;
        
        vis[i][j] = true;
        
        for (int l = 0; l < 4; l++) {
            int nx = i + dx[l];
            int ny = j + dy[l];
            dfs(nx, ny, grid, vis);
        }
        
        return;
    }
    //Function to find the number of 'X' total shapes.
    public int xShape(char[][] grid)
    {
        int xShapes = 0;
        int n = grid.length;
        int m = grid[0].length;
        
        boolean[][] vis = new boolean[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && grid[i][j] == 'X') {
                    xShapes++;
                    dfs(i, j, grid, vis);
                }
            }
        }
        
        return xShapes;
    }
}
