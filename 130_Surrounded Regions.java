class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i*j==0 || i==rows-1 || j==cols-1){ 
            //We check for Boundary 'O's and turn them into 'V'.
            //These are valid 'O's and need not to be changed to 'X's.
                    if(board[i][j] == 'O'){
                        dfs(board,i,j);
                    }
                }
            }
        }
//Iterate over the whole grid, change remaining 'O's to 'X's.
//Change 'V's to 'O's
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                else if(board[i][j] == 'V'){
                    board[i][j] = 'O';
                }
            }
        }
    }

//Main DFS Function to convert all the boundary 'O's to 'V's

    private void dfs(char[][] board, int i, int j){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] != 'O'){
            return;
        }
        board[i][j] = 'V';
        dfs(board,i+1,j);
        dfs(board,i-1,j);
        dfs(board,i,j+1);
        dfs(board,i,j-1);
    }

}
