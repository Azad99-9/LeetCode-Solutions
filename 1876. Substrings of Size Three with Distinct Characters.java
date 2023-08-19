class Solution {
    private void insertIntoMap(Map<Character,  Integer> map, Character key) {
        int prevFreq = 0;
        if (map.containsKey(key)) prevFreq = map.get(key);
        map.put(key, prevFreq + 1);
    }
    private void deleteFromMap(Map<Character,  Integer> map, Character key) {
        int prevFreq = map.get(key);
        if (prevFreq == 1)  map.remove(key);
        else map.put(key, prevFreq - 1);
    }
    public int countGoodSubstrings(String s) {
        Map<Character, Integer> map = new HashMap<>();
        // int n = s.length();
        // int r = 0;
        // int l = 0;
        // int ans = 0;
        // while (r < n) {
        //     while (r < n && map.size() <= 3) {
        //         insertIntoMap(map, s.charAt(r));
        //         if(map.size() >= 3) ans++;
        //         r++;
        //     }
        //     while (map.size() > 3) {
        //         deleteFromMap(map, s.charAt(l));
        //         l++;
        //     }
            
        // }
        // return ans;
        int ans = 0;
        if (s.length() < 3) return 0;
        int l = 0;
        int r = 2;
        // Set<Character> track   = new HashSet<>();
        insertIntoMap(map, s.charAt(0));
        insertIntoMap(map, s.charAt(1));
        insertIntoMap(map, s.charAt(2));
        int n = s.length();
        while (r < n) {
            if (map.size() == 3) ans++;
            deleteFromMap(map,  s.charAt(l++));
            r++;
            if (r<n) insertIntoMap(map, s.charAt(r)); 
        }
        return ans;
    }
}