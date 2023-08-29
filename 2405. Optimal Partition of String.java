class Solution {
    public int partitionString(String s) {
       Set<Character> set = new HashSet<>();
       int ans = 1;
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                ans++;
                set = new HashSet<>();
                
            }
            set.add(s.charAt(i));
        }
        return ans;
    }
}