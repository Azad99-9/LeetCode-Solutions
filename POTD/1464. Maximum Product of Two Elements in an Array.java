class Solution {
    public int maxProduct(int[] nums) {
        int pmax = nums[0];
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            int tmp = (pmax - 1) * (nums[i] - 1);
            max = Math.max(max, tmp);
            pmax = Math.max(pmax, nums[i]);
        }
        return max;
    }
}
