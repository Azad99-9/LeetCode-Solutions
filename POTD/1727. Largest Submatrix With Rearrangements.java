class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Convert the matrix to a cumulative sum matrix for each column
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] += matrix[i - 1][j];
                }
            }
        }

        int maxArea = 0;

        // Calculate the maximum area of submatrices with all ones
        for (int i = 0; i < rows; i++) {
            Arrays.sort(matrix[i]);
            for (int j = cols - 1; j >= 0; j--) {
                int height = matrix[i][j];
                int width = cols - j;
                maxArea = Math.max(maxArea, height * width);
            }
        }

        return maxArea;
    }

}
