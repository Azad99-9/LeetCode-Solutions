class Pair {
    int row;
    int col;
    int time;
    Pair(int _row, int _col, int _tm) {
        row = _row;
        col = _col;
        time = _tm;
    }
}
//s-O(N*M)
//T-O(N*M)
class Solution {
    public int orangesRotting(int[][] grid) {
        int n= grid.length;
        int m= grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        int[][] visited = new int[n][m];
        int cntFresh = 0;
        for(int i= 0; i< n; i++) {
            for(int j= 0; j< m; j++) {
                if(grid[i][j] == 2) {
                    q.add(new Pair(i,j,0));
                    visited[i][j] = 2;
                } else 
                    visited[i][j] = 0;
                
                if(grid[i][j] == 1) cntFresh++;
            }
        }

        int time = 0;
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = { 0, 1, 0, -1};
        int cnt = 0;
        while(!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().time;
            time = Math.max(time, t);
            q.poll();
            for(int i= 0; i<4; i++) {
                int nextRow = r+drow[i];
                int nextCol = c+dcol[i];
                if(nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < m && visited[nextRow][nextCol] == 0
                && grid[nextRow][nextCol] == 1) {
                    q.offer(new Pair(nextRow, nextCol, t+1));
                    visited[nextRow][nextCol] = 2;
                    cnt++;
                }
            }
        }
        if(cnt != cntFresh) return -1;
        return time;
    }
}
