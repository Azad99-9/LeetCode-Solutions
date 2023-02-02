//T - O(N!*N)
//S - O(n)

class Solution {
    public boolean isSafe(List<String> board, int row, int col, boolean[] rows, boolean[] ld, boolean[] lu) {
        if(rows[row] == true) return false;
        else if(ld[row+col] == true) return false;
        else if(lu[(board.size()-1)+(col-row)] == true) return false;
        return true;
    }

    public void solve(List<String> board, int col, List<List<String>> ans, boolean[] rows, boolean[] ld, boolean[] lu) {
        if(col == board.size()) {
            ans.add(new LinkedList<>(board));
            return;
        }
        for(int row = 0; row< board.size(); row++) {
            if(isSafe(board, row, col, rows, ld, lu)) {
                rows[row] = true;
                ld[row+col] = true;
                lu[(board.size()-1)+(col-row)] = true;
                StringBuilder temp = new StringBuilder(board.get(row));
                temp.setCharAt(col,'Q');
                board.set(row,temp.toString());
                solve(board, col+1, ans, rows, ld,lu);
                temp = new StringBuilder(board.get(row));
                temp.setCharAt(col,'.');
                board.set(row,temp.toString());
                rows[row] = false;
                ld[row+col] = false;
                lu[(board.size()-1)+(col-row)] = false;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new LinkedList<>();
        List<String> board = new LinkedList<>();
        for(int i= 0; i< n; i++)
            board.add(".".repeat(n));
        boolean[] rows = new boolean[n];
        boolean[] ld = new boolean[2*n];
        boolean[] lu = new boolean[2*n];
        solve(board, 0, ans, rows, ld, lu);

        return ans;
    }
}
