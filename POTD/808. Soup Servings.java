class Solution {
    private double aEmpty (int A, int B, double[][] dp) {
        if (A <= 0 && B <= 0) return 0.5;
        if (A <= 0) return 1.0;
        if (B <= 0) return 0.0;

        if (dp[A][B] != -1.0) return dp[A][B];
        return dp[A][B] = (aEmpty(A-100, B, dp) + aEmpty(A-75, B-25, dp) + aEmpty(A-50, B-50, dp) + aEmpty(A-25, B-75, dp))*0.25;
    }
    public double soupServings(int n) {
        // return aEmpty(n,n);
        if (n >= 5000) return 1;

        double[][] dp = new double[n+1][n+1];
        for (double[] arr: dp) Arrays.fill(arr, -1.0);
        return aEmpty(n, n, dp);

    }
}