class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        List<Integer> ans = new ArrayList<>();

        // calculate last indices
        for (int i = n-1; i > -1; i--) {
            if (!map.containsKey(s.charAt(i))) map.put(s.charAt(i), i);
        }

        // logic to divide string
        int r = 0;
        int lastIndex = 0;
        int l = 0;
        while (r < n) {
            while (r <= lastIndex) {
                lastIndex = Math.max(map.get(s.charAt(r)), lastIndex);
                r++;
            }
            ans.add(lastIndex - l + 1);
            l = lastIndex + 1;
            r = l;
            lastIndex = l;
        }
        return ans;
    }
}