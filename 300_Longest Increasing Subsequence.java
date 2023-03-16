class Solution {
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
       int[] next = new int[n + 1];
       int[] cur = new int[n + 1];
       for (int i = n - 1; i >= 0; i--) {
           for (int prev = i - 1; prev >= -1; prev--) {
               int len = 0 + next[prev + 1];
               if (prev == -1 || arr[i] > arr[prev]) len = Math.max(len , 1 + next[i + 1]);
           cur[prev + 1] = len;
           }
           next = cur;
       }
       return next[0];
    }
    
}
