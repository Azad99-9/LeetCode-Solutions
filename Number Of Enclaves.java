class Pair {
    int i, j;
    Pair(int _i, int _j) {
        i = _i;
        j = _j;
    }
}

class Solution {
    

    int numberOfEnclaves(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        
        int noofLandCells = 0;
        
        if (m <= 2 || n <= 2) return noofLandCells;
         
        Queue<Pair> helper = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 1) {
                grid[i][0] = 0;
                helper.offer(new Pair(i, 0));
            }
            if (grid[i][m-1] == 1) {
                grid[i][m-1] = 0;
                helper.offer(new Pair(i, m-1));
            }
        }
        
        for (int i = 1; i < m-1; i++) {
            if (grid[0][i] == 1) {
                grid[0][i] = 0;
                helper.offer(new Pair(0, i));
            }
            if (grid[n-1][i] == 1) {
                grid[n-1][i] = 0;
                helper.offer(new Pair(n-1, i));
            }
        }
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        while (!helper.isEmpty()) {
            Pair cur = helper.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = cur.i + dx[i];
                int ny = cur.j + dy[i];
                
                if (nx > -1 && ny > -1 && nx < n && ny < m && grid[nx][ny] == 1) {
                    grid[nx][ny] = 0;
                    
                    helper.offer(new Pair(nx, ny));
                }
            }
        }
        
        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < m-1; j++) {
                if (grid[i][j] == 1) noofLandCells++;
            }
        }
        
        return noofLandCells;
    }
}