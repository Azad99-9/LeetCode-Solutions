class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int r = k-1;
        int n = nums.length;
        double maxAvg = 0;
        double curSum = 0;
        for (int i = 0; i < k; i++) {
            curSum += nums[i];
        }
        maxAvg = curSum / k;
        while (r < n) {
            if (++r < n) {
                curSum -= nums[l++];
                curSum += nums[r];
                maxAvg = Math.max(maxAvg, curSum / k);
            }
        }

        return maxAvg;
    }
}