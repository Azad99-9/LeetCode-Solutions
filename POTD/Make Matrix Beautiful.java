
class Solution {
    public static int findMinOperation(int N, int[][] matrix) {
        int[] sums = new int[2*N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sums[i] += matrix[i][j];
                sums[N+j] += matrix[i][j];
            }
        }
        
        int rowMax = 0;
        int colMax = 0;
        int matrixSum = 0;
        for (int i = 0; i < N; i++) {
            matrixSum += sums[i];
            rowMax = Math.max(sums[i], rowMax);
            colMax = Math.max(sums[N+i], colMax);
        }
        
        return (N*(Math.max(rowMax, colMax))) - matrixSum;
        
    }
}
   