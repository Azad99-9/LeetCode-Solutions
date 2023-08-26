class Solution {
    public int longestkSubstr(String s, int k) {
        int l = 0;
        int r = 0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        
        int max = 0;
        
        while (r < n) {
            int curFreq = 0;
            if (map.containsKey(s.charAt(r))) curFreq = map.get(s.charAt(r));
            map.put(s.charAt(r), curFreq + 1);
            while (map.size() > k) {
                int curfreq = map.get(s.charAt(l));
                if (curfreq == 1) map.remove(s.charAt(l));
                else map.put(s.charAt(l), curfreq - 1);
                l++;
            }
            if (map.size() == k) max = Math.max(r-l+1, max);
            r++;
        }
        return max == 0 ? -1 : max;
    }
}