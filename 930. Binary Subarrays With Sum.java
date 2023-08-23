class Solution {
    public int atMost(int[] nums,int goal) {
        int l = 0;
        int r = 0;
        int curSum = 0;
        int n = nums.length;
        int count = 0;

        while (r < n) {
            curSum += nums[r];
            while (l<=r && curSum > goal) {
                curSum -= nums[l++];
            }
            count += (r - l+1);
            r++;
        }

        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal-1);
    }
}