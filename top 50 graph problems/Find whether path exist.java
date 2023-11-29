class Solution
{
    //Function to find whether a path exists from the source to destination.
    int[] dx= {1, -1, 0, 0};
    int[] dy= {0, 0, 1, -1};
    
    private boolean isValid(int i, int j, int[][] grid, boolean[][] vis) {
        int n = grid.length;
        return (i > -1 && i < n && j > -1 && j < n && !vis[i][j] && grid[i][j] != 0);
    }
    
    private boolean dfs(int i, int j, boolean[][] vis, int[][] grid) {
        if (!isValid(i, j, grid, vis)) return false;
        
        if (grid[i][j] == 2) return true;
        
        vis[i][j] = true;
        
        for (int l = 0; l < 4; l++) {
            int nx = i + dx[l];
            int ny = j + dy[l];
            boolean path_exist = dfs(nx, ny, vis, grid);  
            if (path_exist) return true;
        }
        
        return false;
    }
    
    
    public boolean is_Possible(int[][] grid)
    {
        int[] source = {0, 0};
        boolean ans = false;
        boolean[][] vis = new boolean[grid.length][grid.length];
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == 1) {
                    source = new int[]{i, j};
                    ans = dfs(i, j, vis, grid);
                }
            }
        }
        
        return ans;
    }
}
