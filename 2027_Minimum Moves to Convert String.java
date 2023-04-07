class Solution {
    public int minimumMoves(String s) {
        int N = s.length();
        int count = 0;
        int i = 0;

        while (i < N) {
            if (s.charAt(i) == 'X') {
                i += 3;
                count += 1;
                continue;
            }
            i+=1;
        }
        return count;
    }
}
