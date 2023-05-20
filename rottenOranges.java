class Pair {
        int i, j, time;
        Pair (int _i, int _j, int _time) {
            i = _i;
            j = _j;
            time = _time;
        }
    }

class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public boolean isPossible (int i, int j, int rows, int columns, int[][] grid) {
        if (i > -1 && j > -1 && i < rows && j < columns && grid[i][j] == 1) return true;
        return false;
    }
    
    public int orangesRotting(int[][] grid)
    {
        int rows = grid.length;
        int columns = grid[0].length;
        int cntfrsh = 0;
        
        Queue<Pair> helper = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) helper.offer(new Pair(i, j, 0));
                if (grid[i][j] == 1) cntfrsh++;
            }
        }
        
        int time = 0;
        int cnt = 0;
        
        int[] delx = {1, -1, 0, 0};
        int[] dely = {0, 0, 1, -1};
        
        while (!helper.isEmpty()) {
      
            int size = helper.size();
           
            
            for (int i = 0; i < size; i++) {
                Pair cur = helper.poll();
                
                time = Math.max(cur.time, time);
                for (int j = 0; j < 4; j++) {
                    int nexti = cur.i + delx[j];
                    int nextj = cur.j + dely[j];
                    int t = cur.time;
                    if (isPossible(nexti, nextj, rows, columns, grid)) {
                        grid[nexti][nextj] = 2;
                        cnt++;
                        helper.offer(new Pair(nexti,nextj, t+1));
                    }
                }
            }
            
        //     for (int i = 0; i < grid.length; i++) {
        //     for (int j = 0; j < grid[0].length; j++) {
        //         System.out.print(grid[i][j]);
        //     }
        //     System.out.println();
        // }
        }
        if (cnt != cntfrsh) return -1;
        return time;
        
    }
}