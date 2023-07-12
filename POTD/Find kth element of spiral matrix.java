class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	    int top = 0;
	    int left = 0;
	    int right = m-1;
	    int down = n-1;
	    int direction = 0;
	    int count = 0;
	    
	    while (top <= down && left <= right) {
	       
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    count++;
                    if (count == k) return A[top][i];
                }
                top++;
            } else if (direction == 1) {
                for (int i = top; i <= down; i++) {
                    count++;
                    if (count == k) return A[i][right];
                }
                right--;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    count++;
                    if (count == k) return A[down][i];
                }
                down--;
            } else if (direction == 3) {
                for (int i = down; i >= top; i--) {
                    count++;
                    if (count == k) return A[i][left];
                }
                left++;
            }
            direction = (direction  + 1) % 4;
        }
	    return 0;
    }
}