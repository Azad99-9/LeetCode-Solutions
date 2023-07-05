class Solution {
    public int longestSubarray(int[] nums) {
        int prev = 0;
        int cur = 0;
        int max = 0;
        for (int i : nums) {
            if (i == 1) cur++;
            else {
                max = Math.max(max, prev+cur);
                prev = cur;
                cur = 0;
            }
        }
        max = Math.max(max, prev+cur);
        if (max == nums.length) return nums.length - 1;
        return max;
    }
}