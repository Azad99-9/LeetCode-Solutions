class Solution {
    public boolean isAnagram(String s, String t) {
    	//T-O(N)
    	//S-O(N)
        int[] sArr = new int[26];
        int[] tArr = new int[26];

        for(int i = 0; i < s.length(); i++)
            sArr[s.charAt(i)-'a'] += 1;

        for(int i = 0; i < t.length(); i++)
            tArr[t.charAt(i)-'a'] += 1;

        for(int i = 0; i < 26; i++)
            if(sArr[i] != tArr[i])
                return false;
        
        return true;
    }
}
