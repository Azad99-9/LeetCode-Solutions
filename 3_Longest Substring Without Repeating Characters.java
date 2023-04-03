class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] mpp = new int[256];
        for (int i = 0; i < 256; i++) mpp[i] = -1;
        int left = 0; int right = 0;
        int n= s.length();
        int len = 0;
        while (right < n) {
            if (mpp[s.charAt(right)] != -1) left = Math.max(mpp[s.charAt(right)] + 1, left);
            mpp[s.charAt(right)] = right;

            len = Math.max(len, right - left + 1);
            right++;

        }
        return len;
    }
}
