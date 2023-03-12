class Solution {
    public int rob(int[] nums) {
        // T - O ( N )
        // S - O ( 1 )
        int[] dp = new int[nums.length];
        int prev = nums[0];
        int prev2 = 0;
        for (int i = 1; i < nums.length; i++) {
            int take = nums[i];
            if (i > 1) take += prev2;
            int notake = prev;
            int cur = Math.max(take, notake);
            prev2 = prev;
            prev = cur;
        }
        return prev;
    }
}
