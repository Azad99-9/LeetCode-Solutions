class Solution {
    private int[] preMax (int[] heights) {
        int[] pre = new int[heights.length];

        int preMax = -1;
        for (int i = 0; i < heights.length; i++) {
                if (preMax <= heights[i]) {
                    pre[i] = -1;
                    preMax = heights[i];
                } else pre[i] = preMax;
        }

        return pre;
    }

    private int[] nextMax (int[] heights) {
        int[] next = new int[heights.length];

        int nextMax = -1;
        for (int i = heights.length - 1; i > -1; i--) {
            if (nextMax <= heights[i]) {
                next[i] = -1;
                nextMax = heights[i];
            } else next[i] = nextMax;
        }

        return next;
    }

    public int trap(int[] height) {
        int[] pre = preMax(height);
        int[] next = nextMax(height);

        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            int min = Math.min(pre[i], next[i]);
            if (min != -1) {
                ans += min - height[i];
            }
        }

        return ans;
    }
}