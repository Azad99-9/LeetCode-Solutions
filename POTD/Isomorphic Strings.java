class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        int m = str1.length();
        int n = str2.length();
        
        if (m != n) return false;
        
        Map<Character, Character> mp = new HashMap<>();
        
        for (int i = 0; i < m; i++) {
            char s1_cur_char = str1.charAt(i);
            char s2_cur_char = str2.charAt(i);
            
            if (!mp.containsKey(s1_cur_char) && !mp.containsValue(s2_cur_char)) {
                mp.put(s1_cur_char, s2_cur_char);
                
            } else {
                if (mp.containsKey(s1_cur_char) && s2_cur_char == mp.get(s1_cur_char)) continue;
                else return false;
            }
        }
        
        return true;
        
    }
}
