class Solution {
    public boolean isPossible(int[] weights, int days, int curMax) {
        int curDays = 1;
        int goal = 0;

        for (int i: weights) {
            if (goal+i <= curMax) {
                goal += i;
            } else {
                goal = i;
                curDays++;
            }
        }

        return curDays <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int l = 0;
        for (int i = 0; i < n; i++) l = Math.max(weights[i], l);

        int h = 0;
        for (int i = 0; i < n; i++) h += weights[i];

        int min = Integer.MAX_VALUE;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (isPossible(weights, days, mid)) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }
}