class Solution {
    public int rob1(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;
        for (int i = 1; i < n; i++) {
            int take = nums[i];
            if (i > 1) take += prev2;

            int noTake = prev;

            int cur = Math.max (take, noTake);
            prev2 = prev;
            prev = cur;
        }
        return prev;
    }

    public int rob (int[] nums) {
        int[] t1, t2;
        int n = nums.length;
        t1 = new int[n];
        t2 = new int[n];
        int i1 = 0;
        int i2 = 0;
        if (n == 1) return nums[0];
        for (int i = 0; i < n; i++) {
            if (i != 0) t1[i1++] = nums[i];
            if (i != n - 1) t2[i2++] = nums[i];
        }
        return Math.max (rob1(t1), rob1(t2));
    }
}
