class Solution {
    private int[] nI;
    private int[] getSmall(int[] a, int[] b) {
        if (a[1] < b[0]) return a;
        else if (b[1] < a[0]) {
            nI = a;
            return b;
        }
        return new int[2];
    }

    private boolean isOverlap (int[][] x) {
        Arrays.sort(x, (a,b) -> a[1] - b[1]);
        return x[0][1] >= x[1][0];
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> mergedIntervals = new ArrayList<>();
        nI = newInterval;
        for (int[] i : intervals) {
            if (isOverlap(new int[][]{i, newInterval})) {
                nI[0] = Math.min(i[0], nI[0]);
                nI[1] = Math.max(i[1], nI[1]);
            } else {
                mergedIntervals.add(getSmall(i, nI));
            }
        }
        mergedIntervals.add(nI);
        return mergedIntervals.toArray(new int[mergedIntervals.size()][2]);
    }
}