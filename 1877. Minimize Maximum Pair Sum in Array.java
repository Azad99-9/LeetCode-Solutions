class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = nums[0] + nums[nums.length-1];
        int i = 1;
        int j = nums.length - 2;
        while (i < j) {
            max = Math.max(max, nums[i] + nums[j]);
            i++; j--;
        }
        return max;
    }
}