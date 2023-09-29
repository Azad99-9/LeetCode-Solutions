class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (l == h) return nums[l];

            if (nums[l] <= nums[mid]) {
                if (nums[l] < nums[h]) {
                    h = mid;
                } else {
                    l = mid + 1;
                }
            } else {
                h = mid;
            }
        }

        return 2;
    }
}