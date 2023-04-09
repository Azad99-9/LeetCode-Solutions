class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visiting = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(word.charAt(0) == board[i][j]){
                    boolean found = dfs(0, i, j, visiting, board, word);
                    if(found){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean dfs(int idx, int row, int col, boolean[][] visiting, char[][] board, String word){
        if(idx == word.length()){
            return true;
        }
        if(row < 0 || row == board.length || col < 0 || col == board[0].length || visiting[row][col] || word.charAt(idx) != board[row][col]){
            return false;
        }
        visiting[row][col] = true;
        boolean left = dfs(idx + 1, row, col - 1, visiting, board, word);
        boolean right = dfs(idx + 1, row, col + 1, visiting, board, word);
        boolean up = dfs(idx + 1, row - 1, col, visiting, board, word);
        boolean down = dfs(idx + 1, row + 1, col, visiting, board, word);
        visiting[row][col] = false;
        return up || down || left || right;
    }
}
