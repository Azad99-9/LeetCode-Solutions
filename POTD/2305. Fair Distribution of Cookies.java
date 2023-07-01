class Solution {
    public int recur(int i, int n, int k, int[] cookies, int[] pk) {
        int max = Integer.MIN_VALUE;
        if(i == n) {
            for (int j = 0; j < k; j++)
                max = Math.max(pk[j], max);
            return max;
        }

        int min = Integer.MAX_VALUE;
        for (int j = 0; j< k; j++) {
            pk[j] += cookies[i];
            int cmin = recur(i+1, n, k, cookies, pk);
            pk[j] -= cookies[i];
            min = Math.min(cmin, min);
            
        }
        return min;
    }
    public int distributeCookies(int[] cookies, int k) {
        int[] pk = new int[k];
        return recur(0, cookies.length, k, cookies, pk);
    }
}