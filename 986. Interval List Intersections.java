class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int l = 0;
        int r = 0;

        int fn = firstList.length;
        int sn = secondList.length;

        ArrayList<int[]> ans = new ArrayList<>();

        while (l < fn && r < sn) {
            int x1 = firstList[l][0];
            int y1 = firstList[l][1];
            int x2 = secondList[r][0];
            int y2 = secondList[r][1];

            int rightMin = Math.min(y1, y2);
            int leftMax = Math.max(x1, x2);

            if (leftMax <= rightMin) ans.add(new int[]{leftMax, rightMin});

            if (rightMin == y1 && rightMin == y2) {
                l++; r++;
            } else if (rightMin == y1) l++;
            else if (rightMin == y2) r++;
        }

        // int[][] a = new int[ans.size()][2];
        // int i = 0;
        // for (int[] interSect: ans) a[i++] = interSect;

        return ans.toArray(new int[ans.size()][]);
    }
}