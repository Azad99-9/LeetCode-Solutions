class Solution {
    // Function to find the number of islands.
    public void dfs(char[][] grid, int i, int j, int rows, int columns) {
        if (i >= rows || j >= columns || i < 0 || j < 0) return;
        
        if (grid[i][j] == '0') return;
        
        grid[i][j] = '0';
        
        dfs(grid, i-1, j, rows, columns);
        dfs(grid, i+1, j, rows, columns);
        dfs(grid, i, j-1, rows, columns);
        dfs(grid, i, j+1, rows, columns);
        dfs(grid, i-1, j-1, rows, columns);
        dfs(grid, i+1, j+1, rows, columns);
        dfs(grid, i-1, j+1, rows, columns);
        dfs(grid, i+1, j-1, rows, columns);
        
    }
    
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int isLands = 0;
        
        
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == '1') {
                    isLands+= 1;
                    dfs(grid, i, j, rows, columns);
                }
            }
        }
        
        return isLands;
    }
}