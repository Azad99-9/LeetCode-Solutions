class Pair {
    int i, j, dist;
    Pair(int i, int j, int dist) {
        this.i = i;
        this.j = j;
        this.dist = dist;
    }
}

class Solution {

    int shortestPath(int[][] grid, int[] source, int[] destination) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        
        Queue<Pair> helper = new LinkedList<>();
        
        if (grid[source[0]][source[1]] == 0) return -1;
        if (source[0] == destination[0] && source[1] == destination[1]) return 0;
        
        helper.offer(new Pair(source[0], source[1], 0));
        vis[source[0]][source[1]] = true;
        
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
                if (nx > -1 && ny > -1 && nx < n && ny < m && !vis[nx][ny] && grid[nx][ny] == 1) {
                    if (nx == destination[0] && ny == destination[1]) {
                        return topDist + 1;
                    }
                    helper.offer(new Pair(nx, ny, topDist + 1));
                    vis[nx][ny] = true;
                }
            }
        }
        
        return -1;
    }
}