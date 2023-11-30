class Solution
{
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    private boolean dfs (char board[][], String word, boolean vis[][], int i,int j, int ind) {
        if (ind == word.length()) return true;
        
        if (!isValid(board, i, j, word, ind, vis)) return false;
        
        vis[i][j] = true;
        
        
        for (int l = 0; l < 4; l++) {
            int nx = dx[l] + i;
            int ny = dy[l] + j;
            if (dfs(board, word, vis, nx, ny, ind+1)) return true;
        }
        
        vis[i][j] = false;
        
        return false;
    } 
    
    private boolean isValid(char[][] board, int i, int j, String word, int ind, boolean[][] vis) {
        int r = board.length;
        int c = board[0].length;
        return (i > -1 && i < r && j > -1 && j < c && !vis[i][j] && ind < word.length() && word.charAt(ind) == board[i][j]);
    }
    
    public boolean isWordExist(char[][] board, String word)
    {
        boolean vis[][] = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, vis, i, j, 0)) return true;
            }
        }
        return false;
    }
}
