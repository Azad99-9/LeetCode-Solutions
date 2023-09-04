class Solution{
    static void dfs(char[][] a, boolean[][] vis, int n, int m, int i, int j) {
        if (i >= n || i < 0 || j >= m || j < 0 || vis[i][j] || a[i][j] != 'O') return;
        
        vis[i][j] = true;
        a[i][j] = '1';
        
        dfs(a, vis, n, m, i, j+1);
        dfs(a, vis, n, m, i, j-1);
        dfs(a, vis, n, m, i-1, j);
        dfs(a, vis, n, m, i+1, j);
    }
    
    static char[][] fill(int n, int m, char a[][])
    {
        boolean vis[][] = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            dfs(a, vis, n, m, i, 0);
            dfs(a, vis, n, m, i, m-1);
        }
        
        for (int i = 0; i < m; i++) {
            dfs(a, vis, n, m, 0, i);
            dfs(a, vis, n, m, n-1, i);
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 'O') {
                    a[i][j] = 'X';
                } else if (a[i][j] == '1') {
                    a[i][j] = 'O';
                }
            }
        }
        
        return a;
    }
}