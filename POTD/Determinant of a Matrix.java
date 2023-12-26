class Solution
{
    //Function for finding determinant of matrix.
    static int determinantOfMatrix(int mat[][], int n)
    {
        if (n == 1) return mat[0][0];
        if (n == 2) return (
           (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0])
        );
        
        
        int det = 0;
        
        for (int i = 0; i < n; i++) {
            int[][] tmp = new int[n-1][n-1];
            int r = 0, c = 0;
            for (int j = 1; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == k) continue;
                    tmp[r][c++] = mat[j][k];
                }
                r++; c = 0;
            }
            if (i % 2 == 0) {
                det += mat[0][i] * determinantOfMatrix(tmp, n-1);
            } else {
                det -= mat[0][i] * determinantOfMatrix(tmp, n-1);
            }
        }
        
        return det;
    }
}


