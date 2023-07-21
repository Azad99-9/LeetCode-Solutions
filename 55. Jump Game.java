class Solution {
    public int recursion (int i, int n, int[] nums, int[] dp) {
        if (i >= n-1) return 1;

        if (dp[i] != -1) return dp[i];
        int canGo = 0;
        // System.out.println(i);
        for (int j = 1; j <= nums[i]; j++) {
            canGo = recursion(i+j, n, nums, dp);
            if (canGo == 1) {
                return dp[i] = 1;
            }
        }
        return dp[i] = 0;
    }

    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp, -1);
        return recursion(0, nums.length, nums, dp) == 1 ? true : false;
    }
}