class Solution {
    public static int distinctSubsequences (String s) {
        Map<Character, Integer> mp = new HashMap<>();
        
        int count = 1;
        
        for (char ch: s.toCharArray()) {
            int newCount = 2 * count;

            if (mp.containsKey(ch)) {
                newCount -= mp.get(ch);
            }
            
            mp.put(ch, count);
            count = newCount;
        }
        
        return count;
    }
    public static String betterString(String str1, String str2) {
        
        int ds1 = distinctSubsequences(str1);
        int ds2 = distinctSubsequences(str2);
        
        System.out.println(ds1 + " " + ds2);
        if (ds1 < ds2) return str2;
        return str1;
    }
}
