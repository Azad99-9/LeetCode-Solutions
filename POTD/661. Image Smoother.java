class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[] dx = {1,1,1,0,0,0,-1,-1,-1};
        int[] dy = {1,0,-1,1,0,-1,1,0,-1};
        int m = img.length;
        int n = img[0].length;
        int[][] copy = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                copy[i][j] = img[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int ct = 0;
                for (int k = 0; k < 9; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx > -1 && ny > -1 && nx < m && ny < n) {
                        sum += copy[nx][ny];
                        ct++;
                    }
                }
                img[i][j] = (sum / ct);
            }
        }

        return img;
    }
}
