class Solution {
    public int maxProduct(int[] nums) {
        int res = Arrays.stream(nums).max().getAsInt();
        int curMin = 1;
        int curMax = 1;

        // T - O( N )
        // S - O( 1 )

        for(int n : nums) {
            int tmp = curMax * n;
            curMax = Math.max(n * curMax, Math.max(n * curMin, n));
            curMin = Math.min(tmp, Math.min(n * curMin, n));
            res = Math.max(res, curMax);
        }

        return res;
    }
}
