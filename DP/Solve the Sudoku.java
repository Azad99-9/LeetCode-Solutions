class Solution
{
    public static boolean isSafe(int[][] board,
                                 int row, int col,
                                 int num)
    {
        // Row has the unique (row-clash)
        for (int d = 0; d < board.length; d++)
        {
             
            // Check if the number we are trying to
            // place is already present in
            // that row, return false;
            if (board[row][d] == num) {
                return false;
            }
        }
 
        // Column has the unique numbers (column-clash)
        for (int r = 0; r < board.length; r++)
        {
             
            // Check if the number
            // we are trying to
            // place is already present in
            // that column, return false;
            if (board[r][col] == num)
            {
                return false;
            }
        }
 
        // Corresponding square has
        // unique number (box-clash)
        int sqrt = (int)Math.sqrt(board.length);
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;
 
        for (int r = boxRowStart;
             r < boxRowStart + sqrt; r++)
        {
            for (int d = boxColStart;
                 d < boxColStart + sqrt; d++)
            {
                if (board[r][d] == num)
                {
                    return false;
                }
            }
        }
 
        // if there is no clash, it's safe
        return true;
    }
 
    public static boolean SolveSudoku(
        int[][] board)
    {
        int n = 9;
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (board[i][j] == 0)
                {
                    row = i;
                    col = j;
 
                    // We still have some remaining
                    // missing values in Sudoku
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }
 
        // No empty space left
        if (isEmpty)
        {
            return true;
        }
 
        // Else for each-row backtrack
        for (int num = 1; num <= n; num++)
        {
            if (isSafe(board, row, col, num))
            {
                board[row][col] = num;
                if (SolveSudoku(board))
                {
                    // print(board, n);
                    return true;
                }
                else
                {
                    // replace it
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
 
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j]+" ");
            }
            // System.out.println();
        }
        
    }
}