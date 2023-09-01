class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        Set<Integer> preSums = new HashSet<>();
        preSums.add(0);
        int ans = 0;

        int preSum = 0;
        for (int num : nums) {
            int curSum = num + preSum;
            int y = curSum - target;
            if (preSums.contains(y)) {
                ans++;
                preSums = new HashSet<>();
                preSums.add(0);
                preSum = 0;
            } else {
                preSums.add(curSum);
                preSum = curSum;
            }
        }

        return ans;
    }
}