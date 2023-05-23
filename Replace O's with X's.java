class Pair {
    int i, j;
    Pair (int _i, int _j) {
        i = _i;
        j = _j;
    }
}

class Solution{
    static void bfs(char a[][], int n, int m) {
        
        Queue<Pair> helper = new LinkedList<>();
        
        for (int i = 0; i < m; i++) {
            if (a[0][i] == 'O') {
                a[0][i] = 'X';
                // System.out.println(0+" "+i);
                helper.offer(new Pair(0, i));
            }
            if (a[n-1][i] == 'O') {
                a[n-1][i] = 'X';
                // System.out.println(n-1+" "+i);
                helper.offer(new Pair(n-1, i));
            }
        }
        
        for (int i = 1; i < n-1; i++) {
            if (a[i][0] == 'O') {
                a[i][0] = 'X';
                // System.out.println(i+" "+0);
                helper.offer(new Pair(i, 0));
            }
            if (a[i][m-1] == 'O') {
                a[i][m-1] = 'X';
                // System.out.println(i+" "+(m-1));
                helper.offer(new Pair(i, m-1));
            }
        }
        
        
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        while (!helper.isEmpty()) {
            Pair cur = helper.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = cur.i + dx[i];
                int ny = cur.j + dy[i];
                
                if (nx > -1 && ny > -1 && nx < n && ny < m && a[nx][ny] == 'O'){
                    a[nx][ny] = 'X';
                    // System.out.println(dx[i]+" "+dx[i]);
                    // System.out.println(cur.i+" "+(cur.j));
                    // System.out.println(nx+" "+(ny));
                    helper.offer(new Pair(nx, ny));
                }
            }
        }
    }
    
    static char[][] fill(int n, int m, char a[][])
    {
        if (n <= 2 || m <= 2) return a;
        
        char[][] acopy = new char[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j= 0; j< m; j++) {
                acopy[i][j] = a[i][j];
            }
        }
        
        bfs(acopy, n, m);
        
        
        // for (int i = 0; i < n; i++) {
        //     for (int j= 0; j< m; j++) {
        //         System.out.print(acopy[i][j]);
        //     }
        //     System.out.println();
        // }
        
        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < m-1; j++) {
                if (acopy[i][j] == 'O') {
                    a[i][j] = 'X';
                }
            }
        }
        
        return a;
        
    }
}