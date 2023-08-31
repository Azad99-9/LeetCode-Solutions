class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] tracker = new int[1001];

        for (int[] trip : trips) {
            tracker[trip[1]] += trip[0];
            tracker[trip[2]] -= trip[0];
        }

        int curCap = 0;
        for (int num: tracker) {
            curCap += num;
            if (curCap > capacity) {
                return false;
            }
        }

        return true;
    }
}