class Solution {
    void swap(int n, int x, int y, int[][] arr) {
        int t1= arr[x][y];
        int t2= arr[x][y];
        for(int i= 0; i<4; i++) {
            int nx = y;
            int ny = n-1-x;
            t2 = arr[nx][ny];
            arr[nx][ny] = t1;
            t1 = t2;
            x= nx;
            y= ny;
        }
    }
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        for(int i= 0; i<= (n-1)/2; i++)
            for(int j = i; j< n-1-i; j++)
                swap(n,i,j,matrix);
    }
}
