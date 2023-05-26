class Pair {
    int i, j, dist;
    Pair(int i, int j, int dist) {
        this.i = i;
        this.j = j;
        this.dist = dist;
    }
}

class Solution {
    
    int MinimumEffort(int grid[][]) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dist = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        
        
        PriorityQueue<Pair> helper = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        // if (source[0] == destination[0] && source[1] == destination[1]) return 0;
        
        helper.offer(new Pair(0, 0, 0));
        dist[0][0] = 0;
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        while (!helper.isEmpty()) {
            Pair cur = helper.poll();
            int topU = cur.i;
            int topV = cur.j;
            int topDist = cur.dist;
            
            for (int i = 0; i < 4; i++) {
                int nx = topU + dx[i];
                int ny = topV + dy[i];
                if (nx > -1 && ny > -1 && nx < n && ny < m) {
                    
                    int newEffort = Math.max(Math.abs(grid[topU][topV] - grid[nx][ny]), topDist);
                    if (newEffort < dist[nx][ny]) {
                        dist[nx][ny] = newEffort;
                        helper.offer(new Pair(nx, ny, newEffort));
                    }
                    
                }
            }
        }
        
        
        
        return dist[n-1][m-1];
    }
}