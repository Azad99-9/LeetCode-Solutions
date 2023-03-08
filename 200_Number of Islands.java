class Pair {
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public void bfs(boolean[][] vis, Pair cell, char[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        q.offer(cell);
        vis[cell.x][cell.y] = true;
        while(!q.isEmpty()) {
            Pair curent = q.poll();
            int curx = curent.x;
            int cury = curent.y;
            for(int i = 0; i < 4; i++) {
                int nx = curx + dx[i]; int ny = cury + dy[i];
                if(nx > -1 && nx < grid.length && ny > -1 && ny < grid[0].length && grid[nx][ny] == '1' && vis[nx][ny] == false) {
                    q.offer(new Pair(nx, ny));
                    vis[nx][ny] = true;
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        // T - O( mn )
        // S - O( kmn )
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int islands = 0;
        for(int x = 0; x < grid.length; x++) 
            for(int y = 0; y < grid[0].length; y++)
                if(grid[x][y] == '1' && !vis[x][y]) {
                    bfs(vis, new Pair(x, y), grid);
                    islands++;
                }

        return islands;
    }
}
