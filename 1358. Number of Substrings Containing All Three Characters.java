class Solution {
    public int numberOfSubstrings(String s) {
        int l = 0;
        int r = -1;
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int n = s.length();

        while (r < n) {
            while (map.size() == 3) {
                ans += (n-r);
                int freq = map.get(s.charAt(l));
                if (freq == 1) map.remove(s.charAt(l));
                else map.put(s.charAt(l), freq-1);
                l++;
            }
            r++;
            if (r < n) {
                if (map.containsKey(s.charAt(r))) {
                    int freq = map.get(s.charAt(r));
                    map.put(s.charAt(r), freq+1);
                } else {
                    map.put(s.charAt(r), 1);
                }
            }
        }

        return ans;
    }
}