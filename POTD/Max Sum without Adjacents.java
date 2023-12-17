//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        int n2 = 0;
        int n1 = 0;
        int cur = 0;
        for (int i = n-1; i > -1; i--) {
            cur = Math.max(n1, n2 + arr[i]);
            n2 = n1;
            n1 = cur;
        }
        return cur;
    }
}
