class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int[][] oneDist = new int[n][m];
        
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    q.offer(new int[]{i, j, 0});
                    vis[i][j] = true;
                }
            }
        }
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int ci = cur[0];
            int cj = cur[1];
            int cd = cur[2];
            
            oneDist[ci][cj] = cd;
            
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + ci;
                int ny = dy[i] + cj;
                int nd = cd + 1;
                
                if (nx < n && nx > -1 && ny < m && ny > -1 && !vis[nx][ny]) {
                    q.offer(new int[]{nx, ny, nd});
                    vis[nx][ny] = true;
                }
                
            }
        }
        
        return oneDist;
    }
}
