class Solution
{
    int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    private boolean dfs (char board[][], String word, boolean vis[][], int i,int j, int ind) {
        if (ind == word.length()) return true;
        
        if (!isValid(board, i, j, word, ind, vis)) return false;
        
        vis[i][j] = true;
        
        
        for (int l = 0; l < 8; l++) {
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
    
    private void findWord(char[][] board, String word, List<String> a) {
        int r = board.length;
        int c = board[0].length;
        boolean[][] vis = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == word.charAt(0)) {
                   if (dfs(board, word, vis, i, j, 0)) {
                       a.add(word);
                       return;
                   }
                }
            }
        }
        
        return;
    }
    
    public String[] wordBoggle(char board[][], String[] dictionary)
    {
        List<String> a = new ArrayList<>();
        for (String word: dictionary) {
            findWord(board, word, a);
        }
        String[] x = new String[a.size()];
        for (int i = 0; i < x.length; i++) {
            x[i] = a.get(i);
        }
        
        return x;
    }
}
