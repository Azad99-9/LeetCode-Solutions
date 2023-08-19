class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l = 0;
        int r = k-1;
        int n = blocks.length();
        if (n == 1 && blocks.charAt(0) == 'W') return 1;
        int whiteCt = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') whiteCt++;
        }
        int min = whiteCt;
        while (r < n) {
            if (++r < n) {
                if (blocks.charAt(l++) == 'W') whiteCt--;
                if (blocks.charAt(r) == 'W') whiteCt++;
            }
            min = Math.min(whiteCt, min);
        }

        return min;
    }
}