class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0;
        int r = k-1;
        int n = arr.length;
        int curSum = 0;
        int ans = 0;
        for (int i = 0; i < k; i++) {
            curSum += arr[i];
        }

        if (curSum / k >= threshold) ans++;

        while (r < n) {
            if (++r < n) {
                curSum -= arr[l++];
                curSum += arr[r];
                if (curSum / k >= threshold) ans++;
            }
        }

        return ans;
    }
}