lass Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int l = 0;
        int r = n-1;

        int max = 0;
        while (r > l && colors[l] == colors[r]) {
            r--;
        }
        max = r-l;
        r = n - 1;
        while (r > l && colors[l] == colors[r]) {
            l++;
        }
        max = Math.max(max, r-l);

        return max;
    }
}