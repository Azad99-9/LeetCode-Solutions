class Solution {
    public int min2Digit(int i, int j, int[] nums1, int[] nums2) {
        return Math.min(nums1[i], nums2[j])*10 + Math.max(nums1[i], nums2[j]);
    }
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, min = min2Digit(0, 0, nums1, nums2);
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j] && nums1[i] < min) {
                min = nums1[i];
                i++; j++;
            } else {
                min = Math.min(min, min2Digit(i, j, nums1, nums2));
                if (Math.min(nums1[i], nums2[j]) == nums1[i]) i++;
                else j++;
            }
        }
        return min;
    }
}
