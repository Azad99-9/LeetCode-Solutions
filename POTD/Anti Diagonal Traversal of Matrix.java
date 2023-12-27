class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        int n = matrix.length;
        int[] ans = new int[n*n];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            int k = i;
            for (int j = 0; j < i + 1; j++) {
                ans[index++] = matrix[j][k--];
            }
        }
        
        for (int i = 1; i < n; i++) {
            int k = n - 1;
            for (int j = i; j < n; j++) {
                ans[index++] = matrix[j][k--];
            }
        }
        
        return ans;
    }
}
