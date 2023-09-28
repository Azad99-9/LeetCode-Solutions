class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int n = nums.length;
        int h = n - 1;

        while (l <= h) {
            if (l == h) return l;
            int mid = (l + h) >> 1;

            if (mid+1 < n && nums[mid] > nums[mid+1]) h = mid;
            else l = mid + 1;
        }

        return -1;
    }
}