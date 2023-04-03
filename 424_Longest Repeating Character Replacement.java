class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> count = new HashMap<>();
        int res = 0;
        int maxf = 0;

        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            if(count.containsKey(s.charAt(r))) {
                int incremented = count.get(s.charAt(r)) + 1;
                count.put(s.charAt(r), incremented);
            }
            else 
                count.put(s.charAt(r), 1);

            maxf = Math.max(maxf, count.get(s.charAt(r)));

            while((r - l + 1) - maxf > k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }

            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
