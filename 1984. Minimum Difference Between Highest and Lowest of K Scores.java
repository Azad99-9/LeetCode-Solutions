class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int l = 0;
        int r = k-1;
        int min = Math.abs(nums[l] - nums[r]);
        while (r < nums.length) {
            if (++r < nums.length) {
                min = Math.min(Math.abs(nums[++l] - nums[r]),min);
            }
        }

        return min;
    }
}