class Pair {
    int i, j;
    Pair(int _i, int _j) {
        i = _i;
        j = _j;
    }
}



class Solution {
    void dfs(int[][] grid, StringBuilder island, boolean[][] vis, int i, int j, int sx, int sy) {
        vis[i][j] = true;
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        for (int x = 0; x < 4; x++) {
            int nx = i + dx[x];
            int ny = j + dy[x];
            
            if (nx > -1 && ny > -1 && nx < grid.length && ny < grid[0].length && !vis[nx][ny] && grid[nx][ny] == 1) {
                
                island.append(String.valueOf(nx - sx));
                island.append(String.valueOf(ny - sy));
                dfs(grid, island, vis, nx, ny, sx, sy);
            }
        }
    }

    int countDistinctIslands(int[][] grid) {
        Set<String> distinctIslands = new HashSet<>();
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!vis[i][j] && grid[i][j] == 1) {
                    StringBuilder island = new StringBuilder();
                    island.append("00");
                    dfs(grid, island, vis, i, j, i, j);
                    if (island.length() != 0) {
                        
                        distinctIslands.add(island.toString());
                    }
                }
            }
        }
        
        return distinctIslands.size();
        
    }
}
