class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = -1;
        int curSum = 0;
        int min = Integer.MAX_VALUE;
        while (r < n) {
            while (r < n && curSum < target) {
                r++;
                if (r < n) curSum += nums[r];
            }
            // if (r == n) break;
            while (curSum >= target) {
                min = Math.min(min, r-l+1);
                curSum -= nums[l++];
            }
        }
        if (min == Integer.MAX_VALUE) return 0;
        return min;
    }
}