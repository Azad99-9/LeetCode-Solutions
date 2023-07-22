class Solution {
    private final int[][] moves = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};

    public double knightProbability(int n, int k, int row, int column) {
        double[][] dp = new double[n][n];
        dp[row][column] = 1.0;

        for(int move = 1; move<=k; move++) {
            double[][] ndp = new double[n][n];
            for(int r = 0; r<n; r++) {
                for(int c = 0; c<n; c++) {
                    for(int[] m: moves) {
                        int nr = r+m[0];
                        int nc = c+m[1];
                        if (isValid(nr, nc, n)) ndp[r][c] += dp[nr][nc]/8.0;
                    }
                }
            }
            dp = ndp;
        }

        double prob = 0.0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                prob += dp[r][c];
            }
        }

        return prob;
    }

    private boolean isValid(int r, int c, int n) {
        return r >= 0 && r < n && c >= 0 && c < n;
    }
}