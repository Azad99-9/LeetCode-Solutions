class Pair {
    int i, j, dist;
    Pair(int _i, int _j, int _dist) {
        i = _i;
        j = _j;
        dist = _dist;
    }
}

class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    
    public int[][] nearest(int[][] grid)
    {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int[][] dist = new int[grid.length][grid[0].length];
        int rows = grid.length;
        int cols = grid[0].length;
        
        Queue<Pair> helper = new LinkedList<>();
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                if (grid[x][y] == 1) {
                    helper.offer(new Pair(x, y, 0));
                    dist[x][y] = 0;
                    vis[x][y] = true;
                }
            }
        }
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        while (!helper.isEmpty()) {
            
            
            int size = helper.size();
           
            
            
            for (int j = 0; j < size; j++) {
                Pair cur = helper.poll();
                
            
                for (int i = 0; i < 4; i++) {
                    int nx = cur.i+dx[i];
                    int ny = cur.j+dy[i];
                    
                
                    if (nx < rows && ny < cols && nx > -1 && ny > -1 && !vis[nx][ny]) {
                        dist[nx][ny] = cur.dist + 1;
                        
                        vis[nx][ny] = true;
                        helper.offer(new Pair(nx, ny, dist[nx][ny]));
                    }
                }
            }
        }
        
        return dist;
    }
}