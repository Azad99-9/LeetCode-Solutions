class Solution
{
    //Function to find unit area of the largest region of 1s.
    private int maxi = 0;
    int[] dx = {1,1,1,0,0,-1,-1,-1};
    int[] dy = {1,0,-1,1,-1,1,0,-1};
    
    private int dfs(int i,int j, int[][] grid, boolean[][] vis) {
        if (vis[i][j]) return 0;
        
        vis[i][j] = true;
        
        int area = 1;
        
        for (int k = 0; k < 8; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];
            
            if (nx < grid.length && ny < grid[0].length && nx > -1 && ny > -1 && grid[nx][ny] == 1) {
                area += dfs(nx, ny, grid, vis);
            }
        }
        
        return area;
    }
    
    public int findMaxArea(int[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int maxArea = 0;
        
        for (int i = 0;i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(i, j, grid, vis));
                }
            }
        }
        
        return maxArea;
    }
}
