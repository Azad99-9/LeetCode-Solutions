class Solution {
    public int recur(int[] nums, int target, int n, int cs, int[] dp) {

        if (cs == target) return 1;
        if (cs > target) return 0;

        if (dp[cs] != -1) return dp[cs];
        // int left = recur(i, nums, target, n, cs+nums[i]);
        // int right = recur(i+1, nums, target, n, cs);

        int ways = 0;
        for(int i = 0; i < n; i++) {
            ways += recur(nums, target, n, cs+nums[i], dp);
        }

        dp[cs] = ways;
        return ways;
        
    }
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp, -1);
        return recur(nums, target, nums.length, 0, dp);
    }
}