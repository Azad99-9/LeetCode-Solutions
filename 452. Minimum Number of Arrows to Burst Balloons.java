class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        int ans = 1;
        int prevLeft = points[0][0];
        int prevRight = points[0][1];
        int n = points.length;

        for (int i = 0; i < n; i++) {
            if (points[i][0] > prevRight) {
                ans += 1;
                prevRight = points[i][1];
                prevLeft = points[i][0];
            } else {
                prevRight = Math.min(prevRight, points[i][1]);
                prevLeft = Math.max(prevLeft, points[i][0]);
            }
        }
        return ans;
    }
}